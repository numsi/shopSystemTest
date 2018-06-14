package com.shopsys.control;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.shopsys.entity.GoodsType;
import com.shopsys.service.GoodsTypeService;

@Controller
public class GoodsTypeControl {
	@Autowired
	private GoodsTypeService gts;
	/**
	 * 添加商品种类
	 * @param gt
	 * @param request
	 * @return
	 */
	@RequestMapping("sys/addType.do")
	public String addType(GoodsType gt,HttpServletRequest request) {
		int result=0;
		HttpSession session=request.getSession();
		if(gt.getName().length()==0) {
			session.setAttribute("message", "商品类别添加失败");
			return "sys/error";
		}
		result=gts.insertOneType(gt);
		if(result>0) {
			return "redirect:/sys/showType.do";
		}else {
			session.setAttribute("message", "商品类别添加失败");
			return "sys/error";
		}
	}
	/**
	 * 显示所有商品种类
	 * @param request
	 * @return
	 */
	@RequestMapping("sys/showType.do")
	public String listType(HttpServletRequest request) {
		List<GoodsType> types=gts.getAll();
		request.setAttribute("types", types);
		return "sys/listType";
	}
	/**
	 * 删除商品类别
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("{id}/sys/deleteType.do")
    public String delete(@PathVariable int id,HttpServletRequest request){
		int result=0;
		HttpSession session=request.getSession();
		result=gts.deleteOneType(id);
		if(result>0) {
			return "redirect:/sys/showType.do";
		}else {
			session.setAttribute("message", "商品类别删除失败");
			return "sys/error";
		}
        
    }
	/**
	 * 获得原商品类信息
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("{id}/sys/updateType.do")
	public String updateType(@PathVariable int id,HttpServletRequest request) {
		GoodsType gt=new GoodsType();
		HttpSession session=request.getSession();
		gt=gts.selectTypeById(id);
		if(gt!=null) {
			request.setAttribute("goodstype", gt);
			return "sys/updateType";
		}else {
			session.setAttribute("message", "获取原类别信息失败");
			return "sys/error";
		}
	
	}
	/**
	 * 修改商品种类信息
	 * @param gt
	 * @param request
	 * @return
	 */
	@RequestMapping("sys/doUpdateType.do")
	public String doupdate(GoodsType gt,HttpServletRequest request) {
		int result=0;
		HttpSession session=request.getSession();
		result=gts.updateOneType(gt);
		if(result>0) {
			return "redirect:/sys/showType.do";
		}else {
			session.setAttribute("message", "商品类别修改失败");
			return "sys/error";
			}
	}
}

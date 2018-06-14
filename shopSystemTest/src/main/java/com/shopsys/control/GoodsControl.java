package com.shopsys.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shopsys.entity.Goods;
import com.shopsys.entity.GoodsType;
import com.shopsys.service.GoodsService;
import com.shopsys.service.GoodsTypeService;

@Controller
public class GoodsControl {
	@Autowired
	GoodsTypeService gts;
	@Autowired
	GoodsService gss;
	/**
	 * 显示所有商品
	 * @param request
	 * @return
	 */
	@RequestMapping("sys/showGoods.do")
	public String listGoods(HttpServletRequest request) {
		List<Goods> goods=gss.getAll();
		for (Goods g : goods) {
			g.setGoodstype(gts.selectTypeById(g.getTypeid()));
		}
		request.setAttribute("goods", goods);
		return "sys/listGoods";
	}
	/**
	 * 获得商品种类
	 * @param request
	 * @return
	 */
	@RequestMapping("sys/toAddGoods.do")
	public String toadd(HttpServletRequest request) {
		HttpSession session=request.getSession();
		List<GoodsType> types=gts.getAll();
		session.setAttribute("goodstypes", types);
		return "sys/addGoods";
	}
	/**
	 * 添加商品
	 * @param g
	 * @param request
	 * @return
	 */
	@RequestMapping("sys/AddGoods.do")
	public String doadd(Goods g,HttpServletRequest request) {
		int result=0;
		HttpSession session=request.getSession();
		result=gss.insertOneGood(g);
		if(result>0) {
			return "redirect:/sys/showGoods.do";
		}else {
			session.setAttribute("message", "商品添加失败");
			return "sys/error";
		}
	}
	/**
	 * 删除商品
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("{id}/sys/deleteGoods.do")
    public String delete(@PathVariable int id,HttpServletRequest request){
		int result=0;
		HttpSession session=request.getSession();
		result=gss.deleteOneGood(id);
		if(result>0) {
			return "redirect:/sys/showGoods.do";
		}else {
			session.setAttribute("message", "商品删除失败");
			return "sys/error";
		}
        
    }
	/**
	 * 获取原商品信息
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping("{id}/sys/updateGoods.do")
	public String updateType(@PathVariable int id,HttpServletRequest request) {
		Goods g=new Goods();
		HttpSession session=request.getSession();
		g=gss.selectGoodById(id);
		if(g!=null) {
			request.setAttribute("good", g);
			return "sys/updateGoods";
		}else {
			session.setAttribute("message", "获取原商品信息失败");
			return "sys/error";
		}
	
	}
	/**
	 * 修改商品信息
	 * @param g
	 * @param request
	 * @return
	 */
	@RequestMapping("sys/doUpdateGoods.do")
	public String doupdate(Goods g,HttpServletRequest request) {
		int result=0;
		HttpSession session=request.getSession();
		result=gss.updateOneGood(g);
		if(result>0) {
			return "redirect:/sys/showGoods.do";
		}else {
			session.setAttribute("message", "商品修改失败");
			return "sys/error";
			}
	}
}

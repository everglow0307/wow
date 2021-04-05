package com.kh.project.admin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.kh.project.admin.dao.AdminDao;
import com.kh.project.admin.vo.AdminMs;
import com.kh.project.board.vo.AlertPost;
import com.kh.project.member.vo.Member;
	
	@Service("adminService")
	public class AdminServiceImpl implements AdminService {

		@Resource(name="adminDao")
		private AdminDao adminDao;
		
		// 멤버쉽 조회
		@Override
		public List<AdminMs> selectAdmin() throws Exception {
			return adminDao.selectAdminMs();
		}

		// 멤버쉽 다중 삭제
		@Override
		public int deleteAdminMs(int mshipSeq) throws Exception {
			return adminDao.deleteAdminMs(mshipSeq);
		}

		//신고게시글 조회
		@Override
		public List<AlertPost> selectAlert() throws Exception {
			return adminDao.selectAlert();
		}

		//신고내역 삭제
		@Override
		public void deleteAlert(int alertSeq) throws Exception {
			adminDao.deleteAlert(alertSeq);
		}
		
}
	
	
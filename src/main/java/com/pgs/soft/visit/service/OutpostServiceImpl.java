package com.pgs.soft.visit.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pgs.soft.visit.domain.Outpost;
import com.pgs.soft.visit.dao.*;
@Service
@Transactional
public class OutpostServiceImpl implements OutpostService {
	
	 @Autowired
	    private OutpostDAO OutpostDAO;
	 	 	 
	 

		public void addOutpost(Outpost outpost) {
			 OutpostDAO.addOutpost(outpost); 
			
		}
	    public List<Outpost> getOutposts() {
	        return OutpostDAO.getOutposts();
	    }


	 
}
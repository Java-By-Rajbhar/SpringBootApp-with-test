package com.matrimonial.app;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.matrimonial.app.controller.UserProfilesController;

@RunWith(SpringRunner.class)
@WebMvcTest(UserProfilesController.class)
public class TestUserProfilesController {
	 @Autowired
	  private MockMvc mvc;
	 
	 @Test
	 public void testInterested() throws Exception {
//		 mvc.perform(MockMvcRequestBuilders.post("/ineterested/{from}/{target}")).accept(MediaType.APPLICATION_JSON)
//	      .andDo(print())
//	      .andExpect(status().isOk())
//	      .andExpect(MockMvcResultMatchers.jsonPath("$.employeeId").value(1));
		 
		 mvc.perform( MockMvcRequestBuilders.post("/ineterested/{from}/{target}", 1,1) )
	        .andExpect(status().isOk());
		 
	 }
	 
}

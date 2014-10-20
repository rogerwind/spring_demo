package com.roger.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

import com.toger.event.EmailEvent;

public class EmailNotifier implements ApplicationListener<ApplicationEvent>{

	public void onApplicationEvent(ApplicationEvent evt) {
		// TODO Auto-generated method stub
		if(evt instanceof EmailEvent)
		{
			EmailEvent emailEvent=(EmailEvent)evt;
			System.out.println(emailEvent.getAddress());
			System.out.println(emailEvent.getText());
		}else{
			System.out.println("This event is from container: "+evt);
		}
	}
	
}

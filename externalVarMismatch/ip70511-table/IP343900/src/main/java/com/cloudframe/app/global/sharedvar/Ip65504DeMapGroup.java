package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504DeMapGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip65504DeMapGroup")

@Data
public class Ip65504DeMapGroup extends Ip65504DeMapGroupSerialized  implements InitializingBean {
   
					@Getter @Setter private Ip65504DeMap ip65504DeMap = new Ip65504DeMap();
					@Getter @Setter private Ip65504DeNames ip65504DeNames = new Ip65504DeNames();
	
	/**
	* Constructor for Ip65504DeMapGroup
	**/
    public Ip65504DeMapGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp65504DeMap().setParent(this,getStartOffset() + 0);
					getIp65504DeNames().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  

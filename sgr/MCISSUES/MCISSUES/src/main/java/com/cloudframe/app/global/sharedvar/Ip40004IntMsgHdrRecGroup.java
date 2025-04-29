package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004IntMsgHdrRecGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;

            @Component("global_ip40004IntMsgHdrRecGroup")

@Data
public class Ip40004IntMsgHdrRecGroup extends Ip40004IntMsgHdrRecGroupSerialized  implements InitializingBean {
   
					@Getter @Setter private Ip40004IntMsgHdrRec ip40004IntMsgHdrRec = new Ip40004IntMsgHdrRec();
					@Getter @Setter private Ip40004IntMsgDtlRec ip40004IntMsgDtlRec = new Ip40004IntMsgDtlRec();
	
	/**
	* Constructor for Ip40004IntMsgHdrRecGroup
	**/
    public Ip40004IntMsgHdrRecGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
					getIp40004IntMsgHdrRec().setParent(this,getStartOffset() + 0);
					getIp40004IntMsgDtlRec().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }




}
  

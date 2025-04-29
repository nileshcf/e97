package com.cloudframe.app.sf305120.dto;

/**
*  The class ServiceInfo820 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class ServiceInfo820 extends ServiceInfo820Serialized {
   
				@Getter @Setter private SiServiceStruct820 siServiceStruct820 = new SiServiceStruct820();
				@Getter @Setter private SiDataBufferBegin820 siDataBufferBegin820 = new SiDataBufferBegin820();
	
	/**
	* Constructor for ServiceInfo820
	**/
    public ServiceInfo820() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSiServiceStruct820().setParent(this,getStartOffset() + 0);
					getSiDataBufferBegin820().setParent(this,getStartOffset() + 15);
	   	/*  end of offset */
    }





}
  

package com.cloudframe.app.cfdate02.dto;

/**
*  The class TLnshrgrpTableInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class TLnshrgrpTableInit extends TLnshrgrpTableInitSerialized {
   
				@Getter @Setter private TLnshrgrpInit tLnshrgrpInit = new TLnshrgrpInit();
	
	/**
	* Constructor for TLnshrgrpTableInit
	**/
    public TLnshrgrpTableInit() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getTLnshrgrpInit().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  

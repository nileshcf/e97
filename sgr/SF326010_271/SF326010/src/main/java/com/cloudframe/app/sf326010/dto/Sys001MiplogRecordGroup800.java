package com.cloudframe.app.sf326010.dto;

/**
*  The class Sys001MiplogRecordGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Sys001MiplogRecordGroup800 extends Sys001MiplogRecordGroup800Serialized {
   

						@Getter @Setter private char[] sys001MiplogRecord800 = new char[32752];
					@Getter @Setter private ZlogRecord801 zlogRecord801 = new ZlogRecord801();
	
	/**
	* Constructor for Sys001MiplogRecordGroup800
	**/
    public Sys001MiplogRecordGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getZlogRecord801().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setSys001MiplogRecord800(pad(32752," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  

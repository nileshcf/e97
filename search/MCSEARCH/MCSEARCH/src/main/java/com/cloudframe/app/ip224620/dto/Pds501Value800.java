package com.cloudframe.app.ip224620.dto;

/**
*  The class Pds501Value800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Pds501Value800 extends Pds501Value800Serialized {
   

						@Getter @Setter private char[] pds501s1Value800 = new char[2];

						@Getter @Setter private char[] pds501s2Value800 = new char[3];

						@Getter @Setter private char[] pds501s3Value800 = new char[3];

						@Getter @Setter private char[] pds501s4Value800 = new char[8];
	
	/**
	* Constructor for Pds501Value800
	**/
    public Pds501Value800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPds501s1Value800(fillSpace(2));
								setPds501s2Value800(fillSpace(3));
								setPds501s3Value800(fillSpace(3));
								setPds501s4Value800(fillSpace(8));
    }





}
  

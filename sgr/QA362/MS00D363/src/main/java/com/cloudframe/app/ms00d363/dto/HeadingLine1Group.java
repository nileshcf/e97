package com.cloudframe.app.ms00d363.dto;

/**
*  The class HeadingLine1Group is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class HeadingLine1Group extends HeadingLine1GroupSerialized {
   
					@Getter @Setter private HeadingLine1 headingLine1 = new HeadingLine1();
					@Getter @Setter private CertificationHeaderLine certificationHeaderLine = new CertificationHeaderLine();
	
	/**
	* Constructor for HeadingLine1Group
	**/
    public HeadingLine1Group() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getHeadingLine1().setParent(this,getStartOffset() + 0);
					getCertificationHeaderLine().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  

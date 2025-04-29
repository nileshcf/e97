package com.cloudframe.app.ms00d363.dto;

/**
*  The class XlDate1Ln is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class XlDate1Ln extends XlDate1LnSerialized {
   


								@Getter @Setter private int xl1Mm;


								@Getter @Setter private int xl1Dd;


								@Getter @Setter private int xl1Yy;

	
	/**
	* Constructor for XlDate1Ln
	**/
    public XlDate1Ln() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 0
             ,1
             );
								setXl1Mm(0);
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 3
             ,1
             );
								setXl1Dd(0);
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 6
             ,1
             );
								setXl1Yy(0);
       replaceValue( // serialize and save the value
             pad(491," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 9
             ,491
             );
    }





}
  

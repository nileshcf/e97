package com.cloudframe.app.sf305120.dto;

/**
*  The class SvServiceTable282 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class SvServiceTable282 extends SvServiceTable282Serialized { 
   

						@Getter @Setter private char[] svServiceId282 = new char[4];

								@Getter @Setter private int svServiceLnth282;

						@Getter @Setter private char[] svServiceStatus282 = new char[1];

						@Getter @Setter private char[] svElapsedTimeX282 = new char[6];
	
	/**
	* Constructor for SvServiceTable282
	**/
    public SvServiceTable282() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for SvServiceTable282. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SvServiceTable282(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSvServiceId282(fillSpace(4));
								setSvServiceLnth282(0);
								setSvServiceStatus282(fillLowValue(1));
								setSvElapsedTimeX282(("000000").toCharArray());
    } 



}
  

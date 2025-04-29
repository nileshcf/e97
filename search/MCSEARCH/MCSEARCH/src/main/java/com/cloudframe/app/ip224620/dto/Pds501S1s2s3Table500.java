package com.cloudframe.app.ip224620.dto;

/**
*  The class Pds501S1s2s3Table500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Pds501S1s2s3Table500 extends Pds501S1s2s3Table500Serialized { 
   

						@Getter @Setter private char[] subfld1Value500 = new char[2];

						@Getter @Setter private char[] subfld2Value500 = new char[3];

						@Getter @Setter private char[] subfld3Value500 = new char[3];
	
	/**
	* Constructor for Pds501S1s2s3Table500
	**/
    public Pds501S1s2s3Table500() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Pds501S1s2s3Table500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pds501S1s2s3Table500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setSubfld1Value500(fillSpace(2));
								setSubfld2Value500(fillSpace(3));
								setSubfld3Value500(fillSpace(3));
    } 



}
  

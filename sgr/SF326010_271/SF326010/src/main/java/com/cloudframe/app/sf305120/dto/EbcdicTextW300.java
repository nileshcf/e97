package com.cloudframe.app.sf305120.dto;

/**
*  The class EbcdicTextW300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class EbcdicTextW300 extends EbcdicTextW300Serialized { 
   
				@Getter @Setter private EbcdicTextWGroup300Group1 ebcdicTextWGroup300Group1 = new EbcdicTextWGroup300Group1();

				@Getter @Setter private EbcdicTextWGroup300Group5 ebcdicTextWGroup300Group5 = new EbcdicTextWGroup300Group5();
				@Getter @Setter private EbcdicTextWGroup300Group8 ebcdicTextWGroup300Group8 = new EbcdicTextWGroup300Group8();
	
	/**
	* Constructor for EbcdicTextW300
	**/
    public EbcdicTextW300() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for EbcdicTextW300. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public EbcdicTextW300(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getEbcdicTextWGroup300Group1().setParent(this,getStartOffset() + 0);
					getEbcdicTextWGroup300Group5().setParent(this,getStartOffset() + 34);
					getEbcdicTextWGroup300Group8().setParent(this,getStartOffset() + 60);
       replaceValue( // serialize and save the value
             ("0123456789").toCharArray()
             , getStartOffset() + 24
             ,10
             );
    } 



}
  

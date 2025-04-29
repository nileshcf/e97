package com.cloudframe.app.ip305710.dto;

/**
*  The class Ip005703Tbl57Data is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:46. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip005703Tbl57Data extends Ip005703Tbl57DataSerialized { 
   

						@Getter @Setter private char[] ip005703ProdClass = Field.fillLowValue(3);

						@Getter @Setter private char[] ip005703CabCode = Field.fillLowValue(4);
				@Getter @Setter private Ip005703CtcR ip005703CtcR = new Ip005703CtcR();

						@Getter @Setter private char[] ip005703McAssgnId = Field.fillLowValue(6);

								@Getter @Setter private int ip005703OvrdePrtyNum;

								@Getter @Setter private long ip005703FeeCodePtr;
	
	/**
	* Constructor for Ip005703Tbl57Data
	**/
    public Ip005703Tbl57Data() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip005703Tbl57Data. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip005703Tbl57Data(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp005703CtcR().setParent(this,getStartOffset() + 3);
    } 



}
  

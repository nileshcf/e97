package com.cloudframe.app.ip305710.dto;

/**
*  The class Ip005704Tbl57Data is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:46. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip005704Tbl57Data extends Ip005704Tbl57DataSerialized { 
   

						@Getter @Setter private char[] ip005704ProdClass = Field.fillLowValue(3);

						@Getter @Setter private char[] ip005704CabCode = Field.fillLowValue(4);
				@Getter @Setter private Ip005704CtcR ip005704CtcR = new Ip005704CtcR();

						@Getter @Setter private char[] ip005704McAssgnId = Field.fillLowValue(6);

								@Getter @Setter private int ip005704OvrdePrtyNum;

								@Getter @Setter private long ip005704FeeCodePtr;
	
	/**
	* Constructor for Ip005704Tbl57Data
	**/
    public Ip005704Tbl57Data() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip005704Tbl57Data. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip005704Tbl57Data(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp005704CtcR().setParent(this,getStartOffset() + 3);
    } 



}
  

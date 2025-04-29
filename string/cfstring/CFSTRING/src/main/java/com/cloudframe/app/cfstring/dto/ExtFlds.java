package com.cloudframe.app.cfstring.dto;

/**
*  The class ExtFlds is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:40. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class ExtFlds extends ExtFldsSerialized { 
   

								@Getter @Setter private long extPricePlan;

								@Getter @Setter private long extSfo;

						@Getter @Setter private char[] extMarketCd = new char[4];

						@Getter @Setter private char[] extMinId = new char[10];
	
	/**
	* Constructor for ExtFlds
	**/
    public ExtFlds() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ExtFlds. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ExtFlds(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setExtPricePlan(1234L);
								setExtSfo(8691L);
								setExtMarketCd(("----").toCharArray());
								setExtMinId(("TMOB  D---").toCharArray());
    } 



}
  

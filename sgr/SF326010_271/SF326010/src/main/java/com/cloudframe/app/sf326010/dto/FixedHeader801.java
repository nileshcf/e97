package com.cloudframe.app.sf326010.dto;

/**
*  The class FixedHeader801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class FixedHeader801 extends FixedHeader801Serialized { 
   

						@Getter @Setter private char[] sys001MiplogClass801 = Field.fillLowValue(1);

						@Getter @Setter private char[] sys001MiplogTyp801 = Field.fillLowValue(1);

						@Getter @Setter private char[] sys001MiplogRefNum801 = Field.fillLowValue(6);

						@Getter @Setter private char[] sys001MiplogBoxId801 = Field.fillLowValue(3);
				@Getter @Setter private Sys001MiplogTime801 sys001MiplogTime801 = new Sys001MiplogTime801();
				@Getter @Setter private Sys001MiplogDate801 sys001MiplogDate801 = new Sys001MiplogDate801();

						@Getter @Setter private char[] sys001MiplogElaTimX801 = Field.fillLowValue(4);
	
	/**
	* Constructor for FixedHeader801
	**/
    public FixedHeader801() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for FixedHeader801. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FixedHeader801(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSys001MiplogTime801().setParent(this,getStartOffset() + 26);
					getSys001MiplogDate801().setParent(this,getStartOffset() + 29);
    } 



}
  

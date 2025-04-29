package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdBondCallMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdBondCallMmddyycc extends MsdBondCallMmddyyccSerialized { 
   
				@Getter @Setter private MsdBondCallMmddyy msdBondCallMmddyy = new MsdBondCallMmddyy();

								@Getter @Setter private int msdBondCallCc;
	
	/**
	* Constructor for MsdBondCallMmddyycc
	**/
    public MsdBondCallMmddyycc() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdBondCallMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondCallMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMsdBondCallMmddyy().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes MsdBondCallMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getMsdBondCallMmddyy().initialize();
     
                     setMsdBondCallCc(0);
   }


}
  

package com.cloudframe.app.db2func.dto;

/**
*  The class MsdBondDatedMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdBondDatedMmddyycc extends MsdBondDatedMmddyyccSerialized { 
   
				@Getter @Setter private MsdBondDatedMmddyy msdBondDatedMmddyy = new MsdBondDatedMmddyy();

								@Getter @Setter private int msdBondDatedCc;
	
	/**
	* Constructor for MsdBondDatedMmddyycc
	**/
    public MsdBondDatedMmddyycc() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdBondDatedMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondDatedMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMsdBondDatedMmddyy().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes MsdBondDatedMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getMsdBondDatedMmddyy().initialize();
     
                     setMsdBondDatedCc(0);
   }


}
  

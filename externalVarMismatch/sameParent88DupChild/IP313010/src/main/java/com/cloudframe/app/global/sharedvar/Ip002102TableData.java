package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip002102TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip002102TableData extends Ip002102TableDataSerialized { 
   
				@Getter @Setter private Ip002102OldElementId ip002102OldElementId = new Ip002102OldElementId();

								@Getter @Setter private short ip002102OldSubfldNo;
				@Getter @Setter private Ip002102NewElementId ip002102NewElementId = new Ip002102NewElementId();

								@Getter @Setter private short ip002102NewSubfldNo;

						@Getter @Setter private char[] ip002102Justified = Field.fillLowValue(1);

								@Getter @Setter private int ip002102FirstDefaultPtr;

						@Getter @Setter private char[] ip002102FirstDefaultPtrRedefined = Field.fillLowValue(4);

								@Getter @Setter private int ip002102LastDefaultPtr;
	
	/**
	* Constructor for Ip002102TableData
	**/
    public Ip002102TableData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip002102TableData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip002102TableData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp002102OldElementId().setParent(this,getStartOffset() + 0);
					getIp002102NewElementId().setParent(this,getStartOffset() + 6);
    } 

	/**
	 * 	initializes Ip002102TableData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp002102OldElementId().initialize();
     
         	setIp002102OldSubfldNo((short)0);
          getIp002102NewElementId().initialize();
     
         	setIp002102NewSubfldNo((short)0);
         setIp002102Justified(CONSTANTS.SPACE);
                     setIp002102FirstDefaultPtr(0);
                     setIp002102LastDefaultPtr(0);
   }


}
  

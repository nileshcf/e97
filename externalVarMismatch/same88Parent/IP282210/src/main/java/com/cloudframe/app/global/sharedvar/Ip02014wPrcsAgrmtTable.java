package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014wPrcsAgrmtTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip02014wPrcsAgrmtTable extends Ip02014wPrcsAgrmtTableSerialized { 
   
				@Getter @Setter private Ip02014wPrcssAgrmtTable ip02014wPrcssAgrmtTable = new Ip02014wPrcssAgrmtTable();
	
	/**
	* Constructor for Ip02014wPrcsAgrmtTable
	**/
    public Ip02014wPrcsAgrmtTable() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip02014wPrcsAgrmtTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip02014wPrcsAgrmtTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp02014wPrcssAgrmtTable().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip02014wPrcsAgrmtTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp02014wPrcssAgrmtTable().initialize();
     
   }


}
  

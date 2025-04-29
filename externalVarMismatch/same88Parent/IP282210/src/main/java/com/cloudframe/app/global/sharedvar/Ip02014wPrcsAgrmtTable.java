package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014wPrcsAgrmtTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip02014wPrcsAgrmtTable extends Ip02014wPrcsAgrmtTableSerialized { 
   
				private Ip02014wPrcssAgrmtTable ip02014wPrcssAgrmtTable = new Ip02014wPrcssAgrmtTable();
	
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
	       			ip02014wPrcssAgrmtTable.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip02014wPrcssAgrmtTable
	 *	@return ip02014wPrcssAgrmtTable
	 */   
	 public Ip02014wPrcssAgrmtTable getIp02014wPrcssAgrmtTable() {
   	return ip02014wPrcssAgrmtTable;
   }
   /**
	* 	Update Ip02014wPrcssAgrmtTable with the passed value
	*   Corresponding COBOL Variable is IP02014W-PRCSS-AGRMT-TABLE
	*	@param value
	*/
   public void setIp02014wPrcssAgrmtTable(char[] value) {
      ip02014wPrcssAgrmtTable.setString(value); 
   }   
    
     /**
	 * 	Update Ip02014wPrcssAgrmtTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtTable(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014wPrcssAgrmtTable.begin,ip02014wPrcssAgrmtTable.length());
   }
   
     /**
	 * 	Update Ip02014wPrcssAgrmtTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014wPrcssAgrmtTable.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip02014wPrcssAgrmtTable with another Field
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtTable(Field source) {
   	replace(source,0,source.length(),ip02014wPrcssAgrmtTable.begin,ip02014wPrcssAgrmtTable.length());
   }  
   
     /**
	 * 	Update Ip02014wPrcssAgrmtTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtTable(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02014wPrcssAgrmtTable.begin,ip02014wPrcssAgrmtTable.length());
   }
   
     /**
	 * 	Update Ip02014wPrcssAgrmtTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02014wPrcssAgrmtTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02014wPrcssAgrmtTable.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip02014wPrcsAgrmtTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip02014wPrcssAgrmtTable.initialize();
     
   }

		public static int getIp02014wPrcsAgrmtTableFieldLength() {
			return IP_02014W_PRCS_AGRMT_TABLE_LENGTH;
		}

}
  

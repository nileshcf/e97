package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip2ooo1EditWorkRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip2ooo1EditWorkRecord")

public class Ip2ooo1EditWorkRecord extends Ip2ooo1EditWorkRecordSerialized  implements InitializingBean {
   
				private Ip2ooo1ErrorInfoTable ip2ooo1ErrorInfoTable = new Ip2ooo1ErrorInfoTable();
	
	/**
	* Constructor for Ip2ooo1EditWorkRecord
	**/
    public Ip2ooo1EditWorkRecord() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip2ooo1ErrorInfoTable.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip2ooo1ErrorInfoTable
	 *	@return ip2ooo1ErrorInfoTable
	 */   
	 public Ip2ooo1ErrorInfoTable getIp2ooo1ErrorInfoTable() {
   	return ip2ooo1ErrorInfoTable;
   }
   /**
	* 	Update Ip2ooo1ErrorInfoTable with the passed value
	*   Corresponding COBOL Variable is IP2OOO1-ERROR-INFO-TABLE
	*	@param value
	*/
   public void setIp2ooo1ErrorInfoTable(char[] value) {
      ip2ooo1ErrorInfoTable.setString(value); 
   }   
    
     /**
	 * 	Update Ip2ooo1ErrorInfoTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfoTable(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip2ooo1ErrorInfoTable.begin,ip2ooo1ErrorInfoTable.length());
   }
   
     /**
	 * 	Update Ip2ooo1ErrorInfoTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfoTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip2ooo1ErrorInfoTable.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip2ooo1ErrorInfoTable with another Field
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfoTable(Field source) {
   	replace(source,0,source.length(),ip2ooo1ErrorInfoTable.begin,ip2ooo1ErrorInfoTable.length());
   }  
   
     /**
	 * 	Update Ip2ooo1ErrorInfoTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfoTable(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip2ooo1ErrorInfoTable.begin,ip2ooo1ErrorInfoTable.length());
   }
   
     /**
	 * 	Update Ip2ooo1ErrorInfoTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp2ooo1ErrorInfoTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip2ooo1ErrorInfoTable.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip2ooo1EditWorkRecord
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip2ooo1ErrorInfoTable.initialize();
     
   }

		public static int getIp2ooo1EditWorkRecordFieldLength() {
			return IP_2OOO_1_EDIT_WORK_RECORD_LENGTH;
		}

}
  

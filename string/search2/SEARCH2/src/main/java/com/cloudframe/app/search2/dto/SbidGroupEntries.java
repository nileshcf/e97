package com.cloudframe.app.search2.dto;

/**
*  The class SbidGroupEntries is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.search2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class SbidGroupEntries extends SbidGroupEntriesSerialized { 
   

								private long tblSbid;

						private char[] tblEcp = Field.fillLowValue(6);
	
	/**
	* Constructor for SbidGroupEntries
	**/
    public SbidGroupEntries() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for SbidGroupEntries. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SbidGroupEntries(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tblSbid
	 *	@return tblSbid
	 */
	public long getTblSbid() throws CFException {
       if (isTblSbidModified()) { 
           tblSbid = refreshTblSbid();
        }
   		return tblSbid;
	}
	

	
	   
	/**
	 * 	Update TblSbid with the passed value
	 *  Corresponding COBOL Variable is WS-TBL-SBID
	 *	@param number
	 */
	public void setTblSbid(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    tblSbid = checkTblSbidMaxLimit(number); 
		serializeTblSbid(tblSbid);
	}
	

	/**
	 * 	Update TblSbid with the passed value
	 *	@param value (String or char[])
	 */
	public void setTblSbid(char[] value) throws CFException {
		 tblSbid = serializeTblSbid(value);
	}
	/**
	 * 	Update TblSbid with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setTblSbidString(char[] value) throws CFException {
		 setTblSbid(value);
	}
	/**
	 *	Returns the value of tblEcp
	 *	@return tblEcp
	 */
   public char[] getTblEcp() throws CFException{
     if (isTblEcpModified()) { 
        tblEcp = refreshTblEcp();
     }
   		return tblEcp;
   }

  
	/**
	*  set variable tblEcp
	*  Corresponding COBOL Variable is WS-TBL-ECP
	*  @param value
	**/
   public void setTblEcp(char[] value) {
      tblEcp = checkTblEcpConstraints(value);
      serializeTblEcp(tblEcp);
   } 

     /**
	 * 	Update TblEcp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTblEcp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTblEcp,tblEcp.length);
   	
   }
   
   public void setTblEcp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTblEcp,tblEcp.length);
   	
   }
   
     /**
	 * 	Update TblEcp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTblEcp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTblEcp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TblEcp with another Field
	 *	@param value
	 */
   public void setTblEcp(Field source) {
       replace(source,0,source.length(),beginTblEcp,TBL_ECP_LEN);
   	
   }  
   
     /**
	 * 	Update TblEcp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTblEcp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTblEcp,TBL_ECP_LEN);
   	
   }
   
     /**
	 * 	Update TblEcp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTblEcp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTblEcp+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSbidGroupEntriesFieldLength() {
			return SBID_GROUP_ENTRIES_LENGTH;
		}

}
  

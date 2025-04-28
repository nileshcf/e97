package com.cloudframe.app.sf328010.dto;

/**
*  The class Sf535ZlogServiceEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:01. using version 5.0.0.256
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sf535ZlogServiceEntry extends Sf535ZlogServiceEntrySerialized { 
   

						private char[] sf535ZlogService = Field.fillLowValue(4);

						private char[] sf535ZservDesc = Field.fillLowValue(55);
	
	/**
	* Constructor for Sf535ZlogServiceEntry
	**/
    public Sf535ZlogServiceEntry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf535ZlogServiceEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf535ZlogServiceEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sf535ZlogService
	 *	@return sf535ZlogService
	 */
   public char[] getSf535ZlogService() throws CFException{
     if (isSf535ZlogServiceModified()) { 
        sf535ZlogService = refreshSf535ZlogService();
     }
   		return sf535ZlogService;
   }

  
	/**
	*  set variable sf535ZlogService
	*  Corresponding COBOL Variable is SF535-ZLOG-SERVICE
	*  @param value
	**/
   public void setSf535ZlogService(char[] value) {
      sf535ZlogService = checkSf535ZlogServiceConstraints(value);
      serializeSf535ZlogService(sf535ZlogService);
   } 

     /**
	 * 	Update Sf535ZlogService 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf535ZlogService(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf535ZlogService,sf535ZlogService.length);
   	
   }
   
   public void setSf535ZlogService(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf535ZlogService,sf535ZlogService.length);
   	
   }
   
     /**
	 * 	Update Sf535ZlogService 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZlogService(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf535ZlogService+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf535ZlogService with another Field
	 *	@param value
	 */
   public void setSf535ZlogService(Field source) {
       replace(source,0,source.length(),beginSf535ZlogService,SF_535_ZLOG_SERVICE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf535ZlogService 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf535ZlogService(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf535ZlogService,SF_535_ZLOG_SERVICE_LEN);
   	
   }
   
     /**
	 * 	Update Sf535ZlogService 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZlogService(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf535ZlogService+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf535ZservDesc
	 *	@return sf535ZservDesc
	 */
   public char[] getSf535ZservDesc() throws CFException{
     if (isSf535ZservDescModified()) { 
        sf535ZservDesc = refreshSf535ZservDesc();
     }
   		return sf535ZservDesc;
   }

  
	/**
	*  set variable sf535ZservDesc
	*  Corresponding COBOL Variable is SF535-ZSERV-DESC
	*  @param value
	**/
   public void setSf535ZservDesc(char[] value) {
      sf535ZservDesc = checkSf535ZservDescConstraints(value);
      serializeSf535ZservDesc(sf535ZservDesc);
   } 

     /**
	 * 	Update Sf535ZservDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf535ZservDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf535ZservDesc,sf535ZservDesc.length);
   	
   }
   
   public void setSf535ZservDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf535ZservDesc,sf535ZservDesc.length);
   	
   }
   
     /**
	 * 	Update Sf535ZservDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZservDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf535ZservDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf535ZservDesc with another Field
	 *	@param value
	 */
   public void setSf535ZservDesc(Field source) {
       replace(source,0,source.length(),beginSf535ZservDesc,SF_535_ZSERV_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Sf535ZservDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf535ZservDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf535ZservDesc,SF_535_ZSERV_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Sf535ZservDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf535ZservDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf535ZservDesc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSf535ZlogServiceEntryFieldLength() {
			return SF_535_ZLOG_SERVICE_ENTRY_LENGTH;
		}

}
  

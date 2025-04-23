package com.cloudframe.app.cfdate02.dto;

/**
*  The class CmnPgmArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnPgmArea extends CmnPgmAreaSerialized { 
   

						private char[] cmnErrMsgArea = Field.fillLowValue(512);

						private char[] cmnErrMsgBytes = Field.fillLowValue(512);
				private CmnApplMsgArea cmnApplMsgArea = new CmnApplMsgArea();
	
	/**
	* Constructor for CmnPgmArea
	**/
    public CmnPgmArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnPgmArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPgmArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnApplMsgArea.setParent(this,getStartOffset() + 91);
    } 

	/**
	 *	Returns the value of cmnErrMsgArea
	 *	@return cmnErrMsgArea
	 */
   public char[] getCmnErrMsgArea() throws CFException{
     if (isCmnErrMsgAreaModified()) { 
        cmnErrMsgArea = refreshCmnErrMsgArea();
     }
   		return cmnErrMsgArea;
   }

  
	/**
	*  set variable cmnErrMsgArea
	*  Corresponding COBOL Variable is CMN-ERR-MSG-AREA
	*  @param value
	**/
   public void setCmnErrMsgArea(char[] value) {
      cmnErrMsgArea = checkCmnErrMsgAreaConstraints(value);
      serializeCmnErrMsgArea(cmnErrMsgArea);
   } 

     /**
	 * 	Update CmnErrMsgArea 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnErrMsgArea(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnErrMsgArea,cmnErrMsgArea.length);
   	
   }
   
   public void setCmnErrMsgArea(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrMsgArea,cmnErrMsgArea.length);
   	
   }
   
     /**
	 * 	Update CmnErrMsgArea 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrMsgArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrMsgArea+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnErrMsgArea with another Field
	 *	@param value
	 */
   public void setCmnErrMsgArea(Field source) {
       replace(source,0,source.length(),beginCmnErrMsgArea,CMN_ERR_MSG_AREA_LEN);
   	
   }  
   
     /**
	 * 	Update CmnErrMsgArea 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnErrMsgArea(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnErrMsgArea,CMN_ERR_MSG_AREA_LEN);
   	
   }
   
     /**
	 * 	Update CmnErrMsgArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrMsgArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrMsgArea+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnErrMsgBytes
	 *	@return cmnErrMsgBytes
	 */
   public char[] getCmnErrMsgBytes() throws CFException{
     if (isCmnErrMsgBytesModified()) { 
        cmnErrMsgBytes = refreshCmnErrMsgBytes();
     }
   		return cmnErrMsgBytes;
   }

  
	/**
	*  set variable cmnErrMsgBytes
	*  Corresponding COBOL Variable is CMN-ERR-MSG-BYTES
	*  @param value
	**/
   public void setCmnErrMsgBytes(char[] value) {
      cmnErrMsgBytes = checkCmnErrMsgBytesConstraints(value);
      serializeCmnErrMsgBytes(cmnErrMsgBytes);
   } 

     /**
	 * 	Update CmnErrMsgBytes 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCmnErrMsgBytes(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCmnErrMsgBytes,cmnErrMsgBytes.length);
   	
   }
   
   public void setCmnErrMsgBytes(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrMsgBytes,cmnErrMsgBytes.length);
   	
   }
   
     /**
	 * 	Update CmnErrMsgBytes 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrMsgBytes(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrMsgBytes+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CmnErrMsgBytes with another Field
	 *	@param value
	 */
   public void setCmnErrMsgBytes(Field source) {
       replace(source,0,source.length(),beginCmnErrMsgBytes,CMN_ERR_MSG_BYTES_LEN);
   	
   }  
   
     /**
	 * 	Update CmnErrMsgBytes 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCmnErrMsgBytes(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCmnErrMsgBytes,CMN_ERR_MSG_BYTES_LEN);
   	
   }
   
     /**
	 * 	Update CmnErrMsgBytes 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnErrMsgBytes(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCmnErrMsgBytes+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of cmnApplMsgArea
	 *	@return cmnApplMsgArea
	 */   
	 public CmnApplMsgArea getCmnApplMsgArea() {
   	return cmnApplMsgArea;
   }
   /**
	* 	Update CmnApplMsgArea with the passed value
	*   Corresponding COBOL Variable is CMN-APPL-MSG-AREA
	*	@param value
	*/
   public void setCmnApplMsgArea(char[] value) {
      cmnApplMsgArea.setString(value); 
   }   
    
     /**
	 * 	Update CmnApplMsgArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnApplMsgArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnApplMsgArea.begin,cmnApplMsgArea.length());
   }
   
     /**
	 * 	Update CmnApplMsgArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnApplMsgArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnApplMsgArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnApplMsgArea with another Field
	 *	@param value
	 */
   public void setCmnApplMsgArea(Field source) {
   	replace(source,0,source.length(),cmnApplMsgArea.begin,cmnApplMsgArea.length());
   }  
   
     /**
	 * 	Update CmnApplMsgArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnApplMsgArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnApplMsgArea.begin,cmnApplMsgArea.length());
   }
   
     /**
	 * 	Update CmnApplMsgArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnApplMsgArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnApplMsgArea.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnPgmAreaFieldLength() {
			return CMN_PGM_AREA_LENGTH;
		}

}
  

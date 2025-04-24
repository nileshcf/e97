package com.cloudframe.app.bm8090m.dto;

/**
*  The class WRespuestaMrGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WRespuestaMrGroup extends WRespuestaMrGroupSerialized { 
   

						private char[] wRespuestaMr = new char[25];
					private WRespuMr wRespuMr = new WRespuMr();
	
	/**
	* Constructor for WRespuestaMrGroup
	**/
    public WRespuestaMrGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wRespuMr.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setWRespuestaMr(fillSpace(25));
    }


 

	/**
	 *	Returns the value of wRespuestaMr
	 *	@return wRespuestaMr
	 */
   public char[] getWRespuestaMr() throws CFException{
     if (isWRespuestaMrModified()) { 
        wRespuestaMr = refreshWRespuestaMr();
     }
   		return wRespuestaMr;
   }

  
	/**
	*  set variable wRespuestaMr
	*  Corresponding COBOL Variable is W-RESPUESTA-MR
	*  @param value
	**/
   public void setWRespuestaMr(char[] value) {
      wRespuestaMr = checkWRespuestaMrConstraints(value);
      serializeWRespuestaMr(wRespuestaMr);
   } 

     /**
	 * 	Update WRespuestaMr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespuestaMr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWRespuestaMr,wRespuestaMr.length);
   	
   }
   
   public void setWRespuestaMr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWRespuestaMr,wRespuestaMr.length);
   	
   }
   
     /**
	 * 	Update WRespuestaMr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespuestaMr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWRespuestaMr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WRespuestaMr with another Field
	 *	@param value
	 */
   public void setWRespuestaMr(Field source) {
       replace(source,0,source.length(),beginWRespuestaMr,W_RESPUESTA_MR_LEN);
   	
   }  
   
     /**
	 * 	Update WRespuestaMr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespuestaMr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWRespuestaMr,W_RESPUESTA_MR_LEN);
   	
   }
   
     /**
	 * 	Update WRespuestaMr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespuestaMr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWRespuestaMr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wRespuMr
	 *	@return wRespuMr
	 */   
	 public WRespuMr getWRespuMr() {
   	return wRespuMr;
   }
   /**
	* 	Update WRespuMr with the passed value
	*   Corresponding COBOL Variable is W-RESPU-MR
	*	@param value
	*/
   public void setWRespuMr(char[] value) {
      wRespuMr.setString(value); 
   }   
    
     /**
	 * 	Update WRespuMr 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWRespuMr(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wRespuMr.begin,wRespuMr.length());
   }
   
     /**
	 * 	Update WRespuMr 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespuMr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wRespuMr.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WRespuMr with another Field
	 *	@param value
	 */
   public void setWRespuMr(Field source) {
   	replace(source,0,source.length(),wRespuMr.begin,wRespuMr.length());
   }  
   
     /**
	 * 	Update WRespuMr 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWRespuMr(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wRespuMr.begin,wRespuMr.length());
   }
   
     /**
	 * 	Update WRespuMr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespuMr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wRespuMr.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWRespuestaMrGroupFieldLength() {
			return W_RESPUESTA_MR_GROUP_LENGTH;
		}

}
  

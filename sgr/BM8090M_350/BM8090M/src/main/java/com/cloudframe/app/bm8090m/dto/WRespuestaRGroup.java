package com.cloudframe.app.bm8090m.dto;

/**
*  The class WRespuestaRGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WRespuestaRGroup extends WRespuestaRGroupSerialized {
   

						private char[] wRespuestaR = new char[42];
					private WRespuR wRespuR = new WRespuR();
	
	/**
	* Constructor for WRespuestaRGroup
	**/
    public WRespuestaRGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wRespuR.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setWRespuestaR(fillSpace(42));
    }


 

	/**
	 *	Returns the value of wRespuestaR
	 *	@return wRespuestaR
	 */
   public char[] getWRespuestaR() throws CFException{
     if (isWRespuestaRModified()) { 
        wRespuestaR = refreshWRespuestaR();
     }
   		return wRespuestaR;
   }

  
	/**
	*  set variable wRespuestaR
	*  Corresponding COBOL Variable is W-RESPUESTA-R
	*  @param value
	**/
   public void setWRespuestaR(char[] value) {
      wRespuestaR = checkWRespuestaRConstraints(value);
      serializeWRespuestaR(wRespuestaR);
   } 

     /**
	 * 	Update WRespuestaR 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespuestaR(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWRespuestaR,wRespuestaR.length);
   	
   }
   
   public void setWRespuestaR(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWRespuestaR,wRespuestaR.length);
   	
   }
   
     /**
	 * 	Update WRespuestaR 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespuestaR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWRespuestaR+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WRespuestaR with another Field
	 *	@param value
	 */
   public void setWRespuestaR(Field source) {
       replace(source,0,source.length(),beginWRespuestaR,W_RESPUESTA_R_LEN);
   	
   }  
   
     /**
	 * 	Update WRespuestaR 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespuestaR(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWRespuestaR,W_RESPUESTA_R_LEN);
   	
   }
   
     /**
	 * 	Update WRespuestaR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespuestaR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWRespuestaR+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wRespuR
	 *	@return wRespuR
	 */   
	 public WRespuR getWRespuR() {
   	return wRespuR;
   }
   /**
	* 	Update WRespuR with the passed value
	*   Corresponding COBOL Variable is W-RESPU-R
	*	@param value
	*/
   public void setWRespuR(char[] value) {
      wRespuR.setString(value); 
   }   
    
     /**
	 * 	Update WRespuR 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWRespuR(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wRespuR.begin,wRespuR.length());
   }
   
     /**
	 * 	Update WRespuR 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespuR(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wRespuR.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WRespuR with another Field
	 *	@param value
	 */
   public void setWRespuR(Field source) {
   	replace(source,0,source.length(),wRespuR.begin,wRespuR.length());
   }  
   
     /**
	 * 	Update WRespuR 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWRespuR(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wRespuR.begin,wRespuR.length());
   }
   
     /**
	 * 	Update WRespuR 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespuR(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wRespuR.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWRespuestaRGroupFieldLength() {
			return W_RESPUESTA_RGROUP_LENGTH;
		}

}
  

package com.cloudframe.app.bm8090m.dto;

/**
*  The class WRespuestaGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WRespuestaGroup extends WRespuestaGroupSerialized { 
   

						private char[] wRespuesta = new char[63];
					private WRespu wRespu = new WRespu();
	
	/**
	* Constructor for WRespuestaGroup
	**/
    public WRespuestaGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			wRespu.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setWRespuesta(pad(63," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of wRespuesta
	 *	@return wRespuesta
	 */
   public char[] getWRespuesta() throws CFException{
     if (isWRespuestaModified()) { 
        wRespuesta = refreshWRespuesta();
     }
   		return wRespuesta;
   }

  
	/**
	*  set variable wRespuesta
	*  Corresponding COBOL Variable is W-RESPUESTA
	*  @param value
	**/
   public void setWRespuesta(char[] value) {
      wRespuesta = checkWRespuestaConstraints(value);
      serializeWRespuesta(wRespuesta);
   } 

     /**
	 * 	Update WRespuesta 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWRespuesta(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWRespuesta,wRespuesta.length);
   	
   }
   
   public void setWRespuesta(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWRespuesta,wRespuesta.length);
   	
   }
   
     /**
	 * 	Update WRespuesta 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespuesta(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWRespuesta+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WRespuesta with another Field
	 *	@param value
	 */
   public void setWRespuesta(Field source) {
       replace(source,0,source.length(),beginWRespuesta,W_RESPUESTA_LEN);
   	
   }  
   
     /**
	 * 	Update WRespuesta 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWRespuesta(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWRespuesta,W_RESPUESTA_LEN);
   	
   }
   
     /**
	 * 	Update WRespuesta 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespuesta(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWRespuesta+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wRespu
	 *	@return wRespu
	 */   
	 public WRespu getWRespu() {
   	return wRespu;
   }
   /**
	* 	Update WRespu with the passed value
	*   Corresponding COBOL Variable is W-RESPU
	*	@param value
	*/
   public void setWRespu(char[] value) {
      wRespu.setString(value); 
   }   
    
     /**
	 * 	Update WRespu 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWRespu(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wRespu.begin,wRespu.length());
   }
   
     /**
	 * 	Update WRespu 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWRespu(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wRespu.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WRespu with another Field
	 *	@param value
	 */
   public void setWRespu(Field source) {
   	replace(source,0,source.length(),wRespu.begin,wRespu.length());
   }  
   
     /**
	 * 	Update WRespu 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWRespu(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wRespu.begin,wRespu.length());
   }
   
     /**
	 * 	Update WRespu 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWRespu(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wRespu.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getWRespuestaGroupFieldLength() {
			return W_RESPUESTA_GROUP_LENGTH;
		}

}
  

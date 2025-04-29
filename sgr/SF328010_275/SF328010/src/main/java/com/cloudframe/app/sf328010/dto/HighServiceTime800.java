package com.cloudframe.app.sf328010.dto;

/**
*  The class HighServiceTime800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HighServiceTime800 extends HighServiceTime800Serialized {
   
				private HserviceDate800 hserviceDate800 = new HserviceDate800();
				private HserviceTime800 hserviceTime800 = new HserviceTime800();
	
	/**
	* Constructor for HighServiceTime800
	**/
    public HighServiceTime800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			hserviceDate800.setParent(this,getStartOffset() + 0);
	       			hserviceTime800.setParent(this,getStartOffset() + 8);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of hserviceDate800
	 *	@return hserviceDate800
	 */   
	 public HserviceDate800 getHserviceDate800() {
   	return hserviceDate800;
   }
   /**
	* 	Update HserviceDate800 with the passed value
	*   Corresponding COBOL Variable is 800-HSERVICE-DATE
	*	@param value
	*/
   public void setHserviceDate800(char[] value) {
      hserviceDate800.setString(value); 
   }   
    
     /**
	 * 	Update HserviceDate800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHserviceDate800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hserviceDate800.begin,hserviceDate800.length());
   }
   
     /**
	 * 	Update HserviceDate800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDate800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hserviceDate800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HserviceDate800 with another Field
	 *	@param value
	 */
   public void setHserviceDate800(Field source) {
   	replace(source,0,source.length(),hserviceDate800.begin,hserviceDate800.length());
   }  
   
     /**
	 * 	Update HserviceDate800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHserviceDate800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hserviceDate800.begin,hserviceDate800.length());
   }
   
     /**
	 * 	Update HserviceDate800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDate800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hserviceDate800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of hserviceTime800
	 *	@return hserviceTime800
	 */   
	 public HserviceTime800 getHserviceTime800() {
   	return hserviceTime800;
   }
   /**
	* 	Update HserviceTime800 with the passed value
	*   Corresponding COBOL Variable is 800-HSERVICE-TIME
	*	@param value
	*/
   public void setHserviceTime800(char[] value) {
      hserviceTime800.setString(value); 
   }   
    
     /**
	 * 	Update HserviceTime800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setHserviceTime800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hserviceTime800.begin,hserviceTime800.length());
   }
   
     /**
	 * 	Update HserviceTime800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceTime800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hserviceTime800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update HserviceTime800 with another Field
	 *	@param value
	 */
   public void setHserviceTime800(Field source) {
   	replace(source,0,source.length(),hserviceTime800.begin,hserviceTime800.length());
   }  
   
     /**
	 * 	Update HserviceTime800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setHserviceTime800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,hserviceTime800.begin,hserviceTime800.length());
   }
   
     /**
	 * 	Update HserviceTime800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceTime800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,hserviceTime800.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getHighServiceTime800FieldLength() {
			return HIGH_SERVICE_TIME_800_LENGTH;
		}

}
  

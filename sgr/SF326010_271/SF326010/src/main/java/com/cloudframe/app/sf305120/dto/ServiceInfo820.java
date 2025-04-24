package com.cloudframe.app.sf305120.dto;

/**
*  The class ServiceInfo820 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ServiceInfo820 extends ServiceInfo820Serialized { 
   
				private SiServiceStruct820 siServiceStruct820 = new SiServiceStruct820();
				private SiDataBufferBegin820 siDataBufferBegin820 = new SiDataBufferBegin820();
	
	/**
	* Constructor for ServiceInfo820
	**/
    public ServiceInfo820() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			siServiceStruct820.setParent(this,getStartOffset() + 0);
	       			siDataBufferBegin820.setParent(this,getStartOffset() + 15);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of siServiceStruct820
	 *	@return siServiceStruct820
	 */   
	 public SiServiceStruct820 getSiServiceStruct820() {
   	return siServiceStruct820;
   }
   /**
	* 	Update SiServiceStruct820 with the passed value
	*   Corresponding COBOL Variable is 820-SI-SERVICE-STRUCT
	*	@param value
	*/
   public void setSiServiceStruct820(char[] value) {
      siServiceStruct820.setString(value); 
   }   
    
     /**
	 * 	Update SiServiceStruct820 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSiServiceStruct820(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,siServiceStruct820.begin,siServiceStruct820.length());
   }
   
     /**
	 * 	Update SiServiceStruct820 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSiServiceStruct820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,siServiceStruct820.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SiServiceStruct820 with another Field
	 *	@param value
	 */
   public void setSiServiceStruct820(Field source) {
   	replace(source,0,source.length(),siServiceStruct820.begin,siServiceStruct820.length());
   }  
   
     /**
	 * 	Update SiServiceStruct820 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSiServiceStruct820(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,siServiceStruct820.begin,siServiceStruct820.length());
   }
   
     /**
	 * 	Update SiServiceStruct820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSiServiceStruct820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,siServiceStruct820.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of siDataBufferBegin820
	 *	@return siDataBufferBegin820
	 */   
	 public SiDataBufferBegin820 getSiDataBufferBegin820() {
   	return siDataBufferBegin820;
   }
   /**
	* 	Update SiDataBufferBegin820 with the passed value
	*   Corresponding COBOL Variable is 820-SI-DATA-BUFFER-BEGIN
	*	@param value
	*/
   public void setSiDataBufferBegin820(char[] value) {
      siDataBufferBegin820.setString(value); 
   }   
    
     /**
	 * 	Update SiDataBufferBegin820 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSiDataBufferBegin820(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,siDataBufferBegin820.begin,siDataBufferBegin820.length());
   }
   
     /**
	 * 	Update SiDataBufferBegin820 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSiDataBufferBegin820(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,siDataBufferBegin820.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SiDataBufferBegin820 with another Field
	 *	@param value
	 */
   public void setSiDataBufferBegin820(Field source) {
   	replace(source,0,source.length(),siDataBufferBegin820.begin,siDataBufferBegin820.length());
   }  
   
     /**
	 * 	Update SiDataBufferBegin820 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSiDataBufferBegin820(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,siDataBufferBegin820.begin,siDataBufferBegin820.length());
   }
   
     /**
	 * 	Update SiDataBufferBegin820 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSiDataBufferBegin820(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,siDataBufferBegin820.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getServiceInfo820FieldLength() {
			return SERVICE_INFO_820_LENGTH;
		}

}
  

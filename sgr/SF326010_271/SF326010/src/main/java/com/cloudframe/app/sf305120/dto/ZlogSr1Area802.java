package com.cloudframe.app.sf305120.dto;

/**
*  The class ZlogSr1Area802 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:03. using version 5.0.0.254
**/


import com.cloudframe.app.sf305120.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ZlogSr1Area802 extends ZlogSr1Area802Serialized {
   
				private SrvreqHeader802 srvreqHeader802 = new SrvreqHeader802();

						private char[] zlogVariableData802 = new char[8167];
	
	/**
	* Constructor for ZlogSr1Area802
	**/
    public ZlogSr1Area802() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			srvreqHeader802.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setZlogVariableData802(fillLowValue(8167));
    }


 

	/**
	 *	Returns the value of srvreqHeader802
	 *	@return srvreqHeader802
	 */   
	 public SrvreqHeader802 getSrvreqHeader802() {
   	return srvreqHeader802;
   }
   /**
	* 	Update SrvreqHeader802 with the passed value
	*   Corresponding COBOL Variable is 802-SRVREQ-HEADER
	*	@param value
	*/
   public void setSrvreqHeader802(char[] value) {
      srvreqHeader802.setString(value); 
   }   
    
     /**
	 * 	Update SrvreqHeader802 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSrvreqHeader802(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,srvreqHeader802.begin,srvreqHeader802.length());
   }
   
     /**
	 * 	Update SrvreqHeader802 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSrvreqHeader802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,srvreqHeader802.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update SrvreqHeader802 with another Field
	 *	@param value
	 */
   public void setSrvreqHeader802(Field source) {
   	replace(source,0,source.length(),srvreqHeader802.begin,srvreqHeader802.length());
   }  
   
     /**
	 * 	Update SrvreqHeader802 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSrvreqHeader802(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,srvreqHeader802.begin,srvreqHeader802.length());
   }
   
     /**
	 * 	Update SrvreqHeader802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSrvreqHeader802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,srvreqHeader802.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of zlogVariableData802
	 *	@return zlogVariableData802
	 */
   public char[] getZlogVariableData802() throws CFException{
     if (isZlogVariableData802Modified()) { 
        zlogVariableData802 = refreshZlogVariableData802();
     }
   		return zlogVariableData802;
   }

  
	/**
	*  set variable zlogVariableData802
	*  Corresponding COBOL Variable is 802-ZLOG-VARIABLE-DATA
	*  @param value
	**/
   public void setZlogVariableData802(char[] value) {
      zlogVariableData802 = checkZlogVariableData802Constraints(value);
      serializeZlogVariableData802(zlogVariableData802);
   } 

     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginZlogVariableData802,zlogVariableData802.length);
   	
   }
   
   public void setZlogVariableData802(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginZlogVariableData802,zlogVariableData802.length);
   	
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginZlogVariableData802+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ZlogVariableData802 with another Field
	 *	@param value
	 */
   public void setZlogVariableData802(Field source) {
       replace(source,0,source.length(),beginZlogVariableData802,ZLOG_VARIABLE_DATA_802_LEN);
   	
   }  
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginZlogVariableData802,ZLOG_VARIABLE_DATA_802_LEN);
   	
   }
   
     /**
	 * 	Update ZlogVariableData802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogVariableData802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginZlogVariableData802+targetIndex,targetLen);
    
   }

	
	
	

		public static int getZlogSr1Area802FieldLength() {
			return ZLOG_SR_1_AREA_802_LENGTH;
		}

}
  

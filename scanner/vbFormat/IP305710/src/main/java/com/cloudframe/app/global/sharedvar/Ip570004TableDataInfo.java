package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip570004TableDataInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:47. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class Ip570004TableDataInfo extends Ip570004TableDataInfoSerialized { 
   

						private char[] ip570004EffdtTm = Field.fillLowValue(10);

								private long ip570004Idx;

								private long ip570004IdxMax;
				private Ip570004TableEntries ip570004TableEntries = new Ip570004TableEntries();
	
	/**
	* Constructor for Ip570004TableDataInfo
	**/
    public Ip570004TableDataInfo() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip570004TableEntries.setParent(this,getStartOffset() + 18);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip570004EffdtTm
	 *	@return ip570004EffdtTm
	 */
   public char[] getIp570004EffdtTm() throws CFException{
     if (isIp570004EffdtTmModified()) { 
        ip570004EffdtTm = refreshIp570004EffdtTm();
     }
   		return ip570004EffdtTm;
   }

  
	/**
	*  set variable ip570004EffdtTm
	*  Corresponding COBOL Variable is IP570004-EFFDT-TM
	*  @param value
	**/
   public void setIp570004EffdtTm(char[] value) {
      ip570004EffdtTm = checkIp570004EffdtTmConstraints(value);
      serializeIp570004EffdtTm(ip570004EffdtTm);
   } 

     /**
	 * 	Update Ip570004EffdtTm 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp570004EffdtTm(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp570004EffdtTm,ip570004EffdtTm.length);
   	
   }
   
   public void setIp570004EffdtTm(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp570004EffdtTm,ip570004EffdtTm.length);
   	
   }
   
     /**
	 * 	Update Ip570004EffdtTm 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp570004EffdtTm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp570004EffdtTm+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip570004EffdtTm with another Field
	 *	@param value
	 */
   public void setIp570004EffdtTm(Field source) {
       replace(source,0,source.length(),beginIp570004EffdtTm,IP_570004_EFFDT_TM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip570004EffdtTm 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp570004EffdtTm(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp570004EffdtTm,IP_570004_EFFDT_TM_LEN);
   	
   }
   
     /**
	 * 	Update Ip570004EffdtTm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp570004EffdtTm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp570004EffdtTm+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip570004Idx
	 *	@return ip570004Idx
	 */
	public long getIp570004Idx() throws CFException {
        if (isIp570004IdxModified()) { 
           ip570004Idx = refreshIp570004Idx();
        }
   		return ip570004Idx;
	}
	
	/**
	 * 	Update Ip570004Idx with the passed value
	 *  Corresponding COBOL Variable is IP570004-IDX
	 *	@param number
	 */
	public void setIp570004Idx(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip570004Idx = checkIp570004IdxMaxLimit(number); 
		serializeIp570004Idx(ip570004Idx);
	}


	/**
	 *	Returns the value of ip570004IdxMax
	 *	@return ip570004IdxMax
	 */
	public long getIp570004IdxMax() throws CFException {
        if (isIp570004IdxMaxModified()) { 
           ip570004IdxMax = refreshIp570004IdxMax();
        }
   		return ip570004IdxMax;
	}
	
	/**
	 * 	Update Ip570004IdxMax with the passed value
	 *  Corresponding COBOL Variable is IP570004-IDX-MAX
	 *	@param number
	 */
	public void setIp570004IdxMax(long number) {
	     // Truncate if the number is beyond +/- Max range
	    ip570004IdxMax = checkIp570004IdxMaxMaxLimit(number); 
		serializeIp570004IdxMax(ip570004IdxMax);
	}


	/**
	 *	Returns the value of ip570004TableEntries
	 *	@return ip570004TableEntries
	 */   
	 public Ip570004TableEntries getIp570004TableEntries() {
   	return ip570004TableEntries;
   }
   /**
	* 	Update Ip570004TableEntries with the passed value
	*   Corresponding COBOL Variable is IP570004-TABLE-ENTRIES
	*	@param value
	*/
   public void setIp570004TableEntries(char[] value) {
      ip570004TableEntries.setString(value); 
   }   
    
     /**
	 * 	Update Ip570004TableEntries 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp570004TableEntries(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip570004TableEntries.begin,ip570004TableEntries.length());
   }
   
     /**
	 * 	Update Ip570004TableEntries 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp570004TableEntries(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip570004TableEntries.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip570004TableEntries with another Field
	 *	@param value
	 */
   public void setIp570004TableEntries(Field source) {
   	replace(source,0,source.length(),ip570004TableEntries.begin,ip570004TableEntries.length());
   }  
   
     /**
	 * 	Update Ip570004TableEntries 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp570004TableEntries(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip570004TableEntries.begin,ip570004TableEntries.length());
   }
   
     /**
	 * 	Update Ip570004TableEntries 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp570004TableEntries(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip570004TableEntries.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip570004TableDataInfo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp570004EffdtTm(CONSTANTS.SPACE_10);
                     setIp570004Idx(0);
                     setIp570004IdxMax(0);
          ip570004TableEntries.initialize();
     
   }

		public static int getIp570004TableDataInfoFieldLength() {
			return IP_570004_TABLE_DATA_INFO_LENGTH;
		}

}
  

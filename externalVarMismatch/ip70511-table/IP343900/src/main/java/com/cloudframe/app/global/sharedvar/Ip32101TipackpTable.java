package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip32101TipackpTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip32101TipackpTable")

public class Ip32101TipackpTable extends Ip32101TipackpTableSerialized  implements InitializingBean {
   

						private char[] ip32101ChkPointKeyText = Field.fillLowValue(17);
				private Ip32101ChkPtKeyCpt ip32101ChkPtKeyCpt = new Ip32101ChkPtKeyCpt();
				private Ip32101ChkPointDataText ip32101ChkPointDataText = new Ip32101ChkPointDataText();
				private Ip32101ChkPtDataCpt ip32101ChkPtDataCpt = new Ip32101ChkPtDataCpt();
				private Ip32101ChkPtDataRct ip32101ChkPtDataRct = new Ip32101ChkPtDataRct();
				private Ip32101ChkPtDataCbhf ip32101ChkPtDataCbhf = new Ip32101ChkPtDataCbhf();
	
	/**
	* Constructor for Ip32101TipackpTable
	**/
    public Ip32101TipackpTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip32101ChkPtKeyCpt.setParent(this,getStartOffset() + 0);
	       			ip32101ChkPointDataText.setParent(this,getStartOffset() + 17);
	       			ip32101ChkPtDataCpt.setParent(this,getStartOffset() + 17);
	       			ip32101ChkPtDataRct.setParent(this,getStartOffset() + 17);
	       			ip32101ChkPtDataCbhf.setParent(this,getStartOffset() + 17);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip32101ChkPointKeyText
	 *	@return ip32101ChkPointKeyText
	 */
   public char[] getIp32101ChkPointKeyText() throws CFException{
     if (isIp32101ChkPointKeyTextModified()) { 
        ip32101ChkPointKeyText = refreshIp32101ChkPointKeyText();
     }
   		return ip32101ChkPointKeyText;
   }

  
	/**
	*  set variable ip32101ChkPointKeyText
	*  Corresponding COBOL Variable is IP32101-CHK-POINT-KEY-TEXT
	*  @param value
	**/
   public void setIp32101ChkPointKeyText(char[] value) {
      ip32101ChkPointKeyText = checkIp32101ChkPointKeyTextConstraints(value);
      serializeIp32101ChkPointKeyText(ip32101ChkPointKeyText);
   } 

     /**
	 * 	Update Ip32101ChkPointKeyText 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp32101ChkPointKeyText(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp32101ChkPointKeyText,ip32101ChkPointKeyText.length);
   	
   }
   
   public void setIp32101ChkPointKeyText(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101ChkPointKeyText,ip32101ChkPointKeyText.length);
   	
   }
   
     /**
	 * 	Update Ip32101ChkPointKeyText 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkPointKeyText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101ChkPointKeyText+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip32101ChkPointKeyText with another Field
	 *	@param value
	 */
   public void setIp32101ChkPointKeyText(Field source) {
       replace(source,0,source.length(),beginIp32101ChkPointKeyText,IP_32101_CHK_POINT_KEY_TEXT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip32101ChkPointKeyText 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp32101ChkPointKeyText(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp32101ChkPointKeyText,IP_32101_CHK_POINT_KEY_TEXT_LEN);
   	
   }
   
     /**
	 * 	Update Ip32101ChkPointKeyText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkPointKeyText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp32101ChkPointKeyText+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip32101ChkPtKeyCpt
	 *	@return ip32101ChkPtKeyCpt
	 */   
	 public Ip32101ChkPtKeyCpt getIp32101ChkPtKeyCpt() {
   	return ip32101ChkPtKeyCpt;
   }
   /**
	* 	Update Ip32101ChkPtKeyCpt with the passed value
	*   Corresponding COBOL Variable is IP32101-CHK-PT-KEY-CPT
	*	@param value
	*/
   public void setIp32101ChkPtKeyCpt(char[] value) {
      ip32101ChkPtKeyCpt.setString(value); 
   }   
    
     /**
	 * 	Update Ip32101ChkPtKeyCpt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp32101ChkPtKeyCpt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPtKeyCpt.begin,ip32101ChkPtKeyCpt.length());
   }
   
     /**
	 * 	Update Ip32101ChkPtKeyCpt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkPtKeyCpt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPtKeyCpt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip32101ChkPtKeyCpt with another Field
	 *	@param value
	 */
   public void setIp32101ChkPtKeyCpt(Field source) {
   	replace(source,0,source.length(),ip32101ChkPtKeyCpt.begin,ip32101ChkPtKeyCpt.length());
   }  
   
     /**
	 * 	Update Ip32101ChkPtKeyCpt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp32101ChkPtKeyCpt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPtKeyCpt.begin,ip32101ChkPtKeyCpt.length());
   }
   
     /**
	 * 	Update Ip32101ChkPtKeyCpt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkPtKeyCpt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPtKeyCpt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip32101ChkPointDataText
	 *	@return ip32101ChkPointDataText
	 */   
	 public Ip32101ChkPointDataText getIp32101ChkPointDataText() {
   	return ip32101ChkPointDataText;
   }
   /**
	* 	Update Ip32101ChkPointDataText with the passed value
	*   Corresponding COBOL Variable is IP32101-CHK-POINT-DATA-TEXT
	*	@param value
	*/
   public void setIp32101ChkPointDataText(char[] value) {
      ip32101ChkPointDataText.setString(value); 
   }   
    
     /**
	 * 	Update Ip32101ChkPointDataText 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp32101ChkPointDataText(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPointDataText.begin,ip32101ChkPointDataText.length());
   }
   
     /**
	 * 	Update Ip32101ChkPointDataText 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkPointDataText(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPointDataText.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip32101ChkPointDataText with another Field
	 *	@param value
	 */
   public void setIp32101ChkPointDataText(Field source) {
   	replace(source,0,source.length(),ip32101ChkPointDataText.begin,ip32101ChkPointDataText.length());
   }  
   
     /**
	 * 	Update Ip32101ChkPointDataText 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp32101ChkPointDataText(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPointDataText.begin,ip32101ChkPointDataText.length());
   }
   
     /**
	 * 	Update Ip32101ChkPointDataText 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkPointDataText(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPointDataText.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip32101ChkPtDataCpt
	 *	@return ip32101ChkPtDataCpt
	 */   
	 public Ip32101ChkPtDataCpt getIp32101ChkPtDataCpt() {
   	return ip32101ChkPtDataCpt;
   }
   /**
	* 	Update Ip32101ChkPtDataCpt with the passed value
	*   Corresponding COBOL Variable is IP32101-CHK-PT-DATA-CPT
	*	@param value
	*/
   public void setIp32101ChkPtDataCpt(char[] value) {
      ip32101ChkPtDataCpt.setString(value); 
   }   
    
     /**
	 * 	Update Ip32101ChkPtDataCpt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp32101ChkPtDataCpt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPtDataCpt.begin,ip32101ChkPtDataCpt.length());
   }
   
     /**
	 * 	Update Ip32101ChkPtDataCpt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkPtDataCpt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPtDataCpt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip32101ChkPtDataCpt with another Field
	 *	@param value
	 */
   public void setIp32101ChkPtDataCpt(Field source) {
   	replace(source,0,source.length(),ip32101ChkPtDataCpt.begin,ip32101ChkPtDataCpt.length());
   }  
   
     /**
	 * 	Update Ip32101ChkPtDataCpt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp32101ChkPtDataCpt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPtDataCpt.begin,ip32101ChkPtDataCpt.length());
   }
   
     /**
	 * 	Update Ip32101ChkPtDataCpt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkPtDataCpt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPtDataCpt.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip32101ChkPtDataRct
	 *	@return ip32101ChkPtDataRct
	 */   
	 public Ip32101ChkPtDataRct getIp32101ChkPtDataRct() {
   	return ip32101ChkPtDataRct;
   }
   /**
	* 	Update Ip32101ChkPtDataRct with the passed value
	*   Corresponding COBOL Variable is IP32101-CHK-PT-DATA-RCT
	*	@param value
	*/
   public void setIp32101ChkPtDataRct(char[] value) {
      ip32101ChkPtDataRct.setString(value); 
   }   
    
     /**
	 * 	Update Ip32101ChkPtDataRct 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp32101ChkPtDataRct(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPtDataRct.begin,ip32101ChkPtDataRct.length());
   }
   
     /**
	 * 	Update Ip32101ChkPtDataRct 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkPtDataRct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPtDataRct.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip32101ChkPtDataRct with another Field
	 *	@param value
	 */
   public void setIp32101ChkPtDataRct(Field source) {
   	replace(source,0,source.length(),ip32101ChkPtDataRct.begin,ip32101ChkPtDataRct.length());
   }  
   
     /**
	 * 	Update Ip32101ChkPtDataRct 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp32101ChkPtDataRct(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPtDataRct.begin,ip32101ChkPtDataRct.length());
   }
   
     /**
	 * 	Update Ip32101ChkPtDataRct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkPtDataRct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPtDataRct.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip32101ChkPtDataCbhf
	 *	@return ip32101ChkPtDataCbhf
	 */   
	 public Ip32101ChkPtDataCbhf getIp32101ChkPtDataCbhf() {
   	return ip32101ChkPtDataCbhf;
   }
   /**
	* 	Update Ip32101ChkPtDataCbhf with the passed value
	*   Corresponding COBOL Variable is IP32101-CHK-PT-DATA-CBHF
	*	@param value
	*/
   public void setIp32101ChkPtDataCbhf(char[] value) {
      ip32101ChkPtDataCbhf.setString(value); 
   }   
    
     /**
	 * 	Update Ip32101ChkPtDataCbhf 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp32101ChkPtDataCbhf(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPtDataCbhf.begin,ip32101ChkPtDataCbhf.length());
   }
   
     /**
	 * 	Update Ip32101ChkPtDataCbhf 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkPtDataCbhf(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPtDataCbhf.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip32101ChkPtDataCbhf with another Field
	 *	@param value
	 */
   public void setIp32101ChkPtDataCbhf(Field source) {
   	replace(source,0,source.length(),ip32101ChkPtDataCbhf.begin,ip32101ChkPtDataCbhf.length());
   }  
   
     /**
	 * 	Update Ip32101ChkPtDataCbhf 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp32101ChkPtDataCbhf(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPtDataCbhf.begin,ip32101ChkPtDataCbhf.length());
   }
   
     /**
	 * 	Update Ip32101ChkPtDataCbhf 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp32101ChkPtDataCbhf(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip32101ChkPtDataCbhf.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip32101TipackpTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp32101ChkPointKeyText(CONSTANTS.SPACE_17);
          ip32101ChkPointDataText.initialize();
     
   }

		public static int getIp32101TipackpTableFieldLength() {
			return IP_32101_TIPACKP_TABLE_LENGTH;
		}

}
  

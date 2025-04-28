package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip34631Tipapim is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:34. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class Ip34631Tipapim extends Ip34631TipapimSerialized { 
   

						private char[] ip34631VirtualAccountNbr = Field.fillLowValue(19);
				private Ip34631CreateUpdateTs ip34631CreateUpdateTs = new Ip34631CreateUpdateTs();

						private char[] ip34631PrimAccountNbr = Field.fillLowValue(19);

						private char[] ip34631ActionCode = Field.fillLowValue(1);

						private char[] ip34631ObsAccessTs = Field.fillLowValue(26);

						private char[] ip34631ObsAccessTsN = Field.fillLowValue(1);

						private char[] ip34631EntRsnCd = Field.fillLowValue(1);

						private char[] ip34631StatCd = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip34631Tipapim
	**/
    public Ip34631Tipapim() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip34631CreateUpdateTs.setParent(this,getStartOffset() + 19);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip34631VirtualAccountNbr
	 *	@return ip34631VirtualAccountNbr
	 */
   public char[] getIp34631VirtualAccountNbr() throws CFException{
     if (isIp34631VirtualAccountNbrModified()) { 
        ip34631VirtualAccountNbr = refreshIp34631VirtualAccountNbr();
     }
   		return ip34631VirtualAccountNbr;
   }

  
	/**
	*  set variable ip34631VirtualAccountNbr
	*  Corresponding COBOL Variable is IP34631-VIRTUAL-ACCOUNT-NBR
	*  @param value
	**/
   public void setIp34631VirtualAccountNbr(char[] value) {
      ip34631VirtualAccountNbr = checkIp34631VirtualAccountNbrConstraints(value);
      serializeIp34631VirtualAccountNbr(ip34631VirtualAccountNbr);
   } 

     /**
	 * 	Update Ip34631VirtualAccountNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34631VirtualAccountNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp34631VirtualAccountNbr,ip34631VirtualAccountNbr.length);
   	
   }
   
   public void setIp34631VirtualAccountNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631VirtualAccountNbr,ip34631VirtualAccountNbr.length);
   	
   }
   
     /**
	 * 	Update Ip34631VirtualAccountNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34631VirtualAccountNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631VirtualAccountNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip34631VirtualAccountNbr with another Field
	 *	@param value
	 */
   public void setIp34631VirtualAccountNbr(Field source) {
       replace(source,0,source.length(),beginIp34631VirtualAccountNbr,IP_34631_VIRTUAL_ACCOUNT_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip34631VirtualAccountNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34631VirtualAccountNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp34631VirtualAccountNbr,IP_34631_VIRTUAL_ACCOUNT_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Ip34631VirtualAccountNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34631VirtualAccountNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631VirtualAccountNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip34631CreateUpdateTs
	 *	@return ip34631CreateUpdateTs
	 */   
	 public Ip34631CreateUpdateTs getIp34631CreateUpdateTs() {
   	return ip34631CreateUpdateTs;
   }
   /**
	* 	Update Ip34631CreateUpdateTs with the passed value
	*   Corresponding COBOL Variable is IP34631-CREATE-UPDATE-TS
	*	@param value
	*/
   public void setIp34631CreateUpdateTs(char[] value) {
      ip34631CreateUpdateTs.setString(value); 
   }   
    
     /**
	 * 	Update Ip34631CreateUpdateTs 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp34631CreateUpdateTs(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip34631CreateUpdateTs.begin,ip34631CreateUpdateTs.length());
   }
   
     /**
	 * 	Update Ip34631CreateUpdateTs 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34631CreateUpdateTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip34631CreateUpdateTs.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip34631CreateUpdateTs with another Field
	 *	@param value
	 */
   public void setIp34631CreateUpdateTs(Field source) {
   	replace(source,0,source.length(),ip34631CreateUpdateTs.begin,ip34631CreateUpdateTs.length());
   }  
   
     /**
	 * 	Update Ip34631CreateUpdateTs 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp34631CreateUpdateTs(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip34631CreateUpdateTs.begin,ip34631CreateUpdateTs.length());
   }
   
     /**
	 * 	Update Ip34631CreateUpdateTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34631CreateUpdateTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip34631CreateUpdateTs.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip34631PrimAccountNbr
	 *	@return ip34631PrimAccountNbr
	 */
   public char[] getIp34631PrimAccountNbr() throws CFException{
     if (isIp34631PrimAccountNbrModified()) { 
        ip34631PrimAccountNbr = refreshIp34631PrimAccountNbr();
     }
   		return ip34631PrimAccountNbr;
   }

  
	/**
	*  set variable ip34631PrimAccountNbr
	*  Corresponding COBOL Variable is IP34631-PRIM-ACCOUNT-NBR
	*  @param value
	**/
   public void setIp34631PrimAccountNbr(char[] value) {
      ip34631PrimAccountNbr = checkIp34631PrimAccountNbrConstraints(value);
      serializeIp34631PrimAccountNbr(ip34631PrimAccountNbr);
   } 

     /**
	 * 	Update Ip34631PrimAccountNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34631PrimAccountNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp34631PrimAccountNbr,ip34631PrimAccountNbr.length);
   	
   }
   
   public void setIp34631PrimAccountNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631PrimAccountNbr,ip34631PrimAccountNbr.length);
   	
   }
   
     /**
	 * 	Update Ip34631PrimAccountNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34631PrimAccountNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631PrimAccountNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip34631PrimAccountNbr with another Field
	 *	@param value
	 */
   public void setIp34631PrimAccountNbr(Field source) {
       replace(source,0,source.length(),beginIp34631PrimAccountNbr,IP_34631_PRIM_ACCOUNT_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip34631PrimAccountNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34631PrimAccountNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp34631PrimAccountNbr,IP_34631_PRIM_ACCOUNT_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Ip34631PrimAccountNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34631PrimAccountNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631PrimAccountNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip34631ActionCode
	 *	@return ip34631ActionCode
	 */
   public char[] getIp34631ActionCode() throws CFException{
     if (isIp34631ActionCodeModified()) { 
        ip34631ActionCode = refreshIp34631ActionCode();
     }
   		return ip34631ActionCode;
   }

  
	/**
	*  set variable ip34631ActionCode
	*  Corresponding COBOL Variable is IP34631-ACTION-CODE
	*  @param value
	**/
   public void setIp34631ActionCode(char[] value) {
      ip34631ActionCode = checkIp34631ActionCodeConstraints(value);
      serializeIp34631ActionCode(ip34631ActionCode);
   } 

     /**
	 * 	Update Ip34631ActionCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34631ActionCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp34631ActionCode,ip34631ActionCode.length);
   	
   }
   
   public void setIp34631ActionCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631ActionCode,ip34631ActionCode.length);
   	
   }
   
     /**
	 * 	Update Ip34631ActionCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34631ActionCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631ActionCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip34631ActionCode with another Field
	 *	@param value
	 */
   public void setIp34631ActionCode(Field source) {
       replace(source,0,source.length(),beginIp34631ActionCode,IP_34631_ACTION_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip34631ActionCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34631ActionCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp34631ActionCode,IP_34631_ACTION_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip34631ActionCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34631ActionCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631ActionCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip34631ObsAccessTs
	 *	@return ip34631ObsAccessTs
	 */
   public char[] getIp34631ObsAccessTs() throws CFException{
     if (isIp34631ObsAccessTsModified()) { 
        ip34631ObsAccessTs = refreshIp34631ObsAccessTs();
     }
   		return ip34631ObsAccessTs;
   }

  
	/**
	*  set variable ip34631ObsAccessTs
	*  Corresponding COBOL Variable is IP34631-OBS-ACCESS-TS
	*  @param value
	**/
   public void setIp34631ObsAccessTs(char[] value) {
      ip34631ObsAccessTs = checkIp34631ObsAccessTsConstraints(value);
      serializeIp34631ObsAccessTs(ip34631ObsAccessTs);
   } 

     /**
	 * 	Update Ip34631ObsAccessTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34631ObsAccessTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp34631ObsAccessTs,ip34631ObsAccessTs.length);
   	
   }
   
   public void setIp34631ObsAccessTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631ObsAccessTs,ip34631ObsAccessTs.length);
   	
   }
   
     /**
	 * 	Update Ip34631ObsAccessTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34631ObsAccessTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631ObsAccessTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip34631ObsAccessTs with another Field
	 *	@param value
	 */
   public void setIp34631ObsAccessTs(Field source) {
       replace(source,0,source.length(),beginIp34631ObsAccessTs,IP_34631_OBS_ACCESS_TS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip34631ObsAccessTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34631ObsAccessTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp34631ObsAccessTs,IP_34631_OBS_ACCESS_TS_LEN);
   	
   }
   
     /**
	 * 	Update Ip34631ObsAccessTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34631ObsAccessTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631ObsAccessTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip34631ObsAccessTsN
	 *	@return ip34631ObsAccessTsN
	 */
   public char[] getIp34631ObsAccessTsN() throws CFException{
     if (isIp34631ObsAccessTsNModified()) { 
        ip34631ObsAccessTsN = refreshIp34631ObsAccessTsN();
     }
   		return ip34631ObsAccessTsN;
   }

  
	/**
	*  set variable ip34631ObsAccessTsN
	*  Corresponding COBOL Variable is IP34631-OBS-ACCESS-TS-N
	*  @param value
	**/
   public void setIp34631ObsAccessTsN(char[] value) {
      ip34631ObsAccessTsN = checkIp34631ObsAccessTsNConstraints(value);
      serializeIp34631ObsAccessTsN(ip34631ObsAccessTsN);
   } 

     /**
	 * 	Update Ip34631ObsAccessTsN 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34631ObsAccessTsN(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp34631ObsAccessTsN,ip34631ObsAccessTsN.length);
   	
   }
   
   public void setIp34631ObsAccessTsN(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631ObsAccessTsN,ip34631ObsAccessTsN.length);
   	
   }
   
     /**
	 * 	Update Ip34631ObsAccessTsN 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34631ObsAccessTsN(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631ObsAccessTsN+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip34631ObsAccessTsN with another Field
	 *	@param value
	 */
   public void setIp34631ObsAccessTsN(Field source) {
       replace(source,0,source.length(),beginIp34631ObsAccessTsN,IP_34631_OBS_ACCESS_TS_N_LEN);
   	
   }  
   
     /**
	 * 	Update Ip34631ObsAccessTsN 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34631ObsAccessTsN(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp34631ObsAccessTsN,IP_34631_OBS_ACCESS_TS_N_LEN);
   	
   }
   
     /**
	 * 	Update Ip34631ObsAccessTsN 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34631ObsAccessTsN(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631ObsAccessTsN+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip34631EntRsnCd
	 *	@return ip34631EntRsnCd
	 */
   public char[] getIp34631EntRsnCd() throws CFException{
     if (isIp34631EntRsnCdModified()) { 
        ip34631EntRsnCd = refreshIp34631EntRsnCd();
     }
   		return ip34631EntRsnCd;
   }

  
	/**
	*  set variable ip34631EntRsnCd
	*  Corresponding COBOL Variable is IP34631-ENT-RSN-CD
	*  @param value
	**/
   public void setIp34631EntRsnCd(char[] value) {
      ip34631EntRsnCd = checkIp34631EntRsnCdConstraints(value);
      serializeIp34631EntRsnCd(ip34631EntRsnCd);
   } 

     /**
	 * 	Update Ip34631EntRsnCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34631EntRsnCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp34631EntRsnCd,ip34631EntRsnCd.length);
   	
   }
   
   public void setIp34631EntRsnCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631EntRsnCd,ip34631EntRsnCd.length);
   	
   }
   
     /**
	 * 	Update Ip34631EntRsnCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34631EntRsnCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631EntRsnCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip34631EntRsnCd with another Field
	 *	@param value
	 */
   public void setIp34631EntRsnCd(Field source) {
       replace(source,0,source.length(),beginIp34631EntRsnCd,IP_34631_ENT_RSN_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip34631EntRsnCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34631EntRsnCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp34631EntRsnCd,IP_34631_ENT_RSN_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip34631EntRsnCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34631EntRsnCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631EntRsnCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip34631StatCd
	 *	@return ip34631StatCd
	 */
   public char[] getIp34631StatCd() throws CFException{
     if (isIp34631StatCdModified()) { 
        ip34631StatCd = refreshIp34631StatCd();
     }
   		return ip34631StatCd;
   }

  
	/**
	*  set variable ip34631StatCd
	*  Corresponding COBOL Variable is IP34631-STAT-CD
	*  @param value
	**/
   public void setIp34631StatCd(char[] value) {
      ip34631StatCd = checkIp34631StatCdConstraints(value);
      serializeIp34631StatCd(ip34631StatCd);
   } 

     /**
	 * 	Update Ip34631StatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp34631StatCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp34631StatCd,ip34631StatCd.length);
   	
   }
   
   public void setIp34631StatCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631StatCd,ip34631StatCd.length);
   	
   }
   
     /**
	 * 	Update Ip34631StatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp34631StatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631StatCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip34631StatCd with another Field
	 *	@param value
	 */
   public void setIp34631StatCd(Field source) {
       replace(source,0,source.length(),beginIp34631StatCd,IP_34631_STAT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip34631StatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp34631StatCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp34631StatCd,IP_34631_STAT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip34631StatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp34631StatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp34631StatCd+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip34631Tipapim
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp34631VirtualAccountNbr(CONSTANTS.SPACE_19);
          ip34631CreateUpdateTs.initialize();
     
         setIp34631PrimAccountNbr(CONSTANTS.SPACE_19);
         setIp34631ActionCode(CONSTANTS.SPACE);
         setIp34631ObsAccessTs(CONSTANTS.SPACE_26);
         setIp34631ObsAccessTsN(CONSTANTS.SPACE);
         setIp34631EntRsnCd(CONSTANTS.SPACE);
         setIp34631StatCd(CONSTANTS.SPACE);
   }

		public static int getIp34631TipapimFieldLength() {
			return IP_34631_TIPAPIM_LENGTH;
		}

}
  

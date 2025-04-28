package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip58041Tipapma is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@GlobalDto
public class Ip58041Tipapma extends Ip58041TipapmaSerialized { 
   

						private char[] ip58041VirtualAccountNbr = Field.fillLowValue(19);
				private Ip58041CreateUpdateTs ip58041CreateUpdateTs = new Ip58041CreateUpdateTs();

						private char[] ip58041PrimAccountNbr = Field.fillLowValue(19);

						private char[] ip58041ActionCode = Field.fillLowValue(1);

						private char[] ip58041ObsAccessTs = Field.fillLowValue(26);

								private short ip58041ObsAccessTsN;

						private char[] ip58041EntRsnCd = Field.fillLowValue(1);

						private char[] ip58041StatCd = Field.fillLowValue(1);

						private char[] ip58041TokenTypeCd = Field.fillLowValue(1);

						private char[] ip58041PartnId = Field.fillLowValue(3);

								private long ip58041Trid;

								private short ip58041TridN;

								private short ip58041TokenAsrLvlNum;

								private short ip58041TokenAsrLvlNumN;

						private char[] ip58041Wid = Field.fillLowValue(3);

								private short ip58041WidN;

						private char[] ip58041PrimAcctSeqNum = Field.fillLowValue(3);

								private short ip58041PrimAcctSeqNumN;

						private char[] ip58041PrcssngAgrmntId = Field.fillLowValue(11);

						private char[] ip58041MqSentSw = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip58041Tipapma
	**/
    public Ip58041Tipapma() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			ip58041CreateUpdateTs.setParent(this,getStartOffset() + 19);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip58041VirtualAccountNbr
	 *	@return ip58041VirtualAccountNbr
	 */
   public char[] getIp58041VirtualAccountNbr() throws CFException{
     if (isIp58041VirtualAccountNbrModified()) { 
        ip58041VirtualAccountNbr = refreshIp58041VirtualAccountNbr();
     }
   		return ip58041VirtualAccountNbr;
   }

  
	/**
	*  set variable ip58041VirtualAccountNbr
	*  Corresponding COBOL Variable is IP58041-VIRTUAL-ACCOUNT-NBR
	*  @param value
	**/
   public void setIp58041VirtualAccountNbr(char[] value) {
      ip58041VirtualAccountNbr = checkIp58041VirtualAccountNbrConstraints(value);
      serializeIp58041VirtualAccountNbr(ip58041VirtualAccountNbr);
   } 

     /**
	 * 	Update Ip58041VirtualAccountNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp58041VirtualAccountNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp58041VirtualAccountNbr,ip58041VirtualAccountNbr.length);
   	
   }
   
   public void setIp58041VirtualAccountNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041VirtualAccountNbr,ip58041VirtualAccountNbr.length);
   	
   }
   
     /**
	 * 	Update Ip58041VirtualAccountNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp58041VirtualAccountNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041VirtualAccountNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip58041VirtualAccountNbr with another Field
	 *	@param value
	 */
   public void setIp58041VirtualAccountNbr(Field source) {
       replace(source,0,source.length(),beginIp58041VirtualAccountNbr,IP_58041_VIRTUAL_ACCOUNT_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip58041VirtualAccountNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp58041VirtualAccountNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp58041VirtualAccountNbr,IP_58041_VIRTUAL_ACCOUNT_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Ip58041VirtualAccountNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp58041VirtualAccountNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041VirtualAccountNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip58041CreateUpdateTs
	 *	@return ip58041CreateUpdateTs
	 */   
	 public Ip58041CreateUpdateTs getIp58041CreateUpdateTs() {
   	return ip58041CreateUpdateTs;
   }
   /**
	* 	Update Ip58041CreateUpdateTs with the passed value
	*   Corresponding COBOL Variable is IP58041-CREATE-UPDATE-TS
	*	@param value
	*/
   public void setIp58041CreateUpdateTs(char[] value) {
      ip58041CreateUpdateTs.setString(value); 
   }   
    
     /**
	 * 	Update Ip58041CreateUpdateTs 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp58041CreateUpdateTs(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip58041CreateUpdateTs.begin,ip58041CreateUpdateTs.length());
   }
   
     /**
	 * 	Update Ip58041CreateUpdateTs 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp58041CreateUpdateTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip58041CreateUpdateTs.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip58041CreateUpdateTs with another Field
	 *	@param value
	 */
   public void setIp58041CreateUpdateTs(Field source) {
   	replace(source,0,source.length(),ip58041CreateUpdateTs.begin,ip58041CreateUpdateTs.length());
   }  
   
     /**
	 * 	Update Ip58041CreateUpdateTs 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp58041CreateUpdateTs(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip58041CreateUpdateTs.begin,ip58041CreateUpdateTs.length());
   }
   
     /**
	 * 	Update Ip58041CreateUpdateTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp58041CreateUpdateTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip58041CreateUpdateTs.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip58041PrimAccountNbr
	 *	@return ip58041PrimAccountNbr
	 */
   public char[] getIp58041PrimAccountNbr() throws CFException{
     if (isIp58041PrimAccountNbrModified()) { 
        ip58041PrimAccountNbr = refreshIp58041PrimAccountNbr();
     }
   		return ip58041PrimAccountNbr;
   }

  
	/**
	*  set variable ip58041PrimAccountNbr
	*  Corresponding COBOL Variable is IP58041-PRIM-ACCOUNT-NBR
	*  @param value
	**/
   public void setIp58041PrimAccountNbr(char[] value) {
      ip58041PrimAccountNbr = checkIp58041PrimAccountNbrConstraints(value);
      serializeIp58041PrimAccountNbr(ip58041PrimAccountNbr);
   } 

     /**
	 * 	Update Ip58041PrimAccountNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp58041PrimAccountNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp58041PrimAccountNbr,ip58041PrimAccountNbr.length);
   	
   }
   
   public void setIp58041PrimAccountNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041PrimAccountNbr,ip58041PrimAccountNbr.length);
   	
   }
   
     /**
	 * 	Update Ip58041PrimAccountNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp58041PrimAccountNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041PrimAccountNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip58041PrimAccountNbr with another Field
	 *	@param value
	 */
   public void setIp58041PrimAccountNbr(Field source) {
       replace(source,0,source.length(),beginIp58041PrimAccountNbr,IP_58041_PRIM_ACCOUNT_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update Ip58041PrimAccountNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp58041PrimAccountNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp58041PrimAccountNbr,IP_58041_PRIM_ACCOUNT_NBR_LEN);
   	
   }
   
     /**
	 * 	Update Ip58041PrimAccountNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp58041PrimAccountNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041PrimAccountNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip58041ActionCode
	 *	@return ip58041ActionCode
	 */
   public char[] getIp58041ActionCode() throws CFException{
     if (isIp58041ActionCodeModified()) { 
        ip58041ActionCode = refreshIp58041ActionCode();
     }
   		return ip58041ActionCode;
   }

  
	/**
	*  set variable ip58041ActionCode
	*  Corresponding COBOL Variable is IP58041-ACTION-CODE
	*  @param value
	**/
   public void setIp58041ActionCode(char[] value) {
      ip58041ActionCode = checkIp58041ActionCodeConstraints(value);
      serializeIp58041ActionCode(ip58041ActionCode);
   } 

     /**
	 * 	Update Ip58041ActionCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp58041ActionCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp58041ActionCode,ip58041ActionCode.length);
   	
   }
   
   public void setIp58041ActionCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041ActionCode,ip58041ActionCode.length);
   	
   }
   
     /**
	 * 	Update Ip58041ActionCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp58041ActionCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041ActionCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip58041ActionCode with another Field
	 *	@param value
	 */
   public void setIp58041ActionCode(Field source) {
       replace(source,0,source.length(),beginIp58041ActionCode,IP_58041_ACTION_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip58041ActionCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp58041ActionCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp58041ActionCode,IP_58041_ACTION_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip58041ActionCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp58041ActionCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041ActionCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip58041ObsAccessTs
	 *	@return ip58041ObsAccessTs
	 */
   public char[] getIp58041ObsAccessTs() throws CFException{
     if (isIp58041ObsAccessTsModified()) { 
        ip58041ObsAccessTs = refreshIp58041ObsAccessTs();
     }
   		return ip58041ObsAccessTs;
   }

  
	/**
	*  set variable ip58041ObsAccessTs
	*  Corresponding COBOL Variable is IP58041-OBS-ACCESS-TS
	*  @param value
	**/
   public void setIp58041ObsAccessTs(char[] value) {
      ip58041ObsAccessTs = checkIp58041ObsAccessTsConstraints(value);
      serializeIp58041ObsAccessTs(ip58041ObsAccessTs);
   } 

     /**
	 * 	Update Ip58041ObsAccessTs 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp58041ObsAccessTs(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp58041ObsAccessTs,ip58041ObsAccessTs.length);
   	
   }
   
   public void setIp58041ObsAccessTs(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041ObsAccessTs,ip58041ObsAccessTs.length);
   	
   }
   
     /**
	 * 	Update Ip58041ObsAccessTs 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp58041ObsAccessTs(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041ObsAccessTs+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip58041ObsAccessTs with another Field
	 *	@param value
	 */
   public void setIp58041ObsAccessTs(Field source) {
       replace(source,0,source.length(),beginIp58041ObsAccessTs,IP_58041_OBS_ACCESS_TS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip58041ObsAccessTs 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp58041ObsAccessTs(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp58041ObsAccessTs,IP_58041_OBS_ACCESS_TS_LEN);
   	
   }
   
     /**
	 * 	Update Ip58041ObsAccessTs 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp58041ObsAccessTs(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041ObsAccessTs+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip58041ObsAccessTsN
	 *	@return ip58041ObsAccessTsN
	 */
	public short getIp58041ObsAccessTsN() throws CFException {
        if (isIp58041ObsAccessTsNModified()) { 
           ip58041ObsAccessTsN = refreshIp58041ObsAccessTsN();
        }
   		return ip58041ObsAccessTsN;
	}
	
	/**
	 * 	Update Ip58041ObsAccessTsN with the passed value
	 *  Corresponding COBOL Variable is IP58041-OBS-ACCESS-TS-N
	 *	@param number
	 */
	public void setIp58041ObsAccessTsN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip58041ObsAccessTsN = checkIp58041ObsAccessTsNMaxLimit(number); 
		serializeIp58041ObsAccessTsN(ip58041ObsAccessTsN);
	}

	public void setIp58041ObsAccessTsN(int number) {
	    number = checkIp58041ObsAccessTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp58041ObsAccessTsN((short)number);
	}
	public void setIp58041ObsAccessTsN(long number) {
	    number = checkIp58041ObsAccessTsNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp58041ObsAccessTsN((short)number);
	}
	

	/**
	 *	Returns the value of ip58041EntRsnCd
	 *	@return ip58041EntRsnCd
	 */
   public char[] getIp58041EntRsnCd() throws CFException{
     if (isIp58041EntRsnCdModified()) { 
        ip58041EntRsnCd = refreshIp58041EntRsnCd();
     }
   		return ip58041EntRsnCd;
   }

  
	/**
	*  set variable ip58041EntRsnCd
	*  Corresponding COBOL Variable is IP58041-ENT-RSN-CD
	*  @param value
	**/
   public void setIp58041EntRsnCd(char[] value) {
      ip58041EntRsnCd = checkIp58041EntRsnCdConstraints(value);
      serializeIp58041EntRsnCd(ip58041EntRsnCd);
   } 

     /**
	 * 	Update Ip58041EntRsnCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp58041EntRsnCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp58041EntRsnCd,ip58041EntRsnCd.length);
   	
   }
   
   public void setIp58041EntRsnCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041EntRsnCd,ip58041EntRsnCd.length);
   	
   }
   
     /**
	 * 	Update Ip58041EntRsnCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp58041EntRsnCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041EntRsnCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip58041EntRsnCd with another Field
	 *	@param value
	 */
   public void setIp58041EntRsnCd(Field source) {
       replace(source,0,source.length(),beginIp58041EntRsnCd,IP_58041_ENT_RSN_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip58041EntRsnCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp58041EntRsnCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp58041EntRsnCd,IP_58041_ENT_RSN_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip58041EntRsnCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp58041EntRsnCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041EntRsnCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip58041StatCd
	 *	@return ip58041StatCd
	 */
   public char[] getIp58041StatCd() throws CFException{
     if (isIp58041StatCdModified()) { 
        ip58041StatCd = refreshIp58041StatCd();
     }
   		return ip58041StatCd;
   }

  
	/**
	*  set variable ip58041StatCd
	*  Corresponding COBOL Variable is IP58041-STAT-CD
	*  @param value
	**/
   public void setIp58041StatCd(char[] value) {
      ip58041StatCd = checkIp58041StatCdConstraints(value);
      serializeIp58041StatCd(ip58041StatCd);
   } 

     /**
	 * 	Update Ip58041StatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp58041StatCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp58041StatCd,ip58041StatCd.length);
   	
   }
   
   public void setIp58041StatCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041StatCd,ip58041StatCd.length);
   	
   }
   
     /**
	 * 	Update Ip58041StatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp58041StatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041StatCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip58041StatCd with another Field
	 *	@param value
	 */
   public void setIp58041StatCd(Field source) {
       replace(source,0,source.length(),beginIp58041StatCd,IP_58041_STAT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip58041StatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp58041StatCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp58041StatCd,IP_58041_STAT_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip58041StatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp58041StatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041StatCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip58041TokenTypeCd
	 *	@return ip58041TokenTypeCd
	 */
   public char[] getIp58041TokenTypeCd() throws CFException{
     if (isIp58041TokenTypeCdModified()) { 
        ip58041TokenTypeCd = refreshIp58041TokenTypeCd();
     }
   		return ip58041TokenTypeCd;
   }

  
	/**
	*  set variable ip58041TokenTypeCd
	*  Corresponding COBOL Variable is IP58041-TOKEN-TYPE-CD
	*  @param value
	**/
   public void setIp58041TokenTypeCd(char[] value) {
      ip58041TokenTypeCd = checkIp58041TokenTypeCdConstraints(value);
      serializeIp58041TokenTypeCd(ip58041TokenTypeCd);
   } 

     /**
	 * 	Update Ip58041TokenTypeCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp58041TokenTypeCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp58041TokenTypeCd,ip58041TokenTypeCd.length);
   	
   }
   
   public void setIp58041TokenTypeCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041TokenTypeCd,ip58041TokenTypeCd.length);
   	
   }
   
     /**
	 * 	Update Ip58041TokenTypeCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp58041TokenTypeCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041TokenTypeCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip58041TokenTypeCd with another Field
	 *	@param value
	 */
   public void setIp58041TokenTypeCd(Field source) {
       replace(source,0,source.length(),beginIp58041TokenTypeCd,IP_58041_TOKEN_TYPE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip58041TokenTypeCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp58041TokenTypeCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp58041TokenTypeCd,IP_58041_TOKEN_TYPE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip58041TokenTypeCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp58041TokenTypeCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041TokenTypeCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip58041PartnId
	 *	@return ip58041PartnId
	 */
   public char[] getIp58041PartnId() throws CFException{
     if (isIp58041PartnIdModified()) { 
        ip58041PartnId = refreshIp58041PartnId();
     }
   		return ip58041PartnId;
   }

  
	/**
	*  set variable ip58041PartnId
	*  Corresponding COBOL Variable is IP58041-PARTN-ID
	*  @param value
	**/
   public void setIp58041PartnId(char[] value) {
      ip58041PartnId = checkIp58041PartnIdConstraints(value);
      serializeIp58041PartnId(ip58041PartnId);
   } 

     /**
	 * 	Update Ip58041PartnId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp58041PartnId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp58041PartnId,ip58041PartnId.length);
   	
   }
   
   public void setIp58041PartnId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041PartnId,ip58041PartnId.length);
   	
   }
   
     /**
	 * 	Update Ip58041PartnId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp58041PartnId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041PartnId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip58041PartnId with another Field
	 *	@param value
	 */
   public void setIp58041PartnId(Field source) {
       replace(source,0,source.length(),beginIp58041PartnId,IP_58041_PARTN_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip58041PartnId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp58041PartnId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp58041PartnId,IP_58041_PARTN_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip58041PartnId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp58041PartnId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041PartnId+targetIndex,targetLen);
    
   }
	public long getIp58041Trid() throws CFException {
        if (isIp58041TridModified()) { 
           ip58041Trid = refreshIp58041Trid();
        }
   		return ip58041Trid;
	}
	
	/**
	 * 	Update Ip58041Trid with the passed value
	 *  Corresponding COBOL Variable is IP58041-TRID
	 *	@param number
	 */
	public void setIp58041Trid(long number) {
			ip58041Trid = checkIp58041TridMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIp58041Trid(ip58041Trid);
	}


	/**
	 *	Returns the value of ip58041TridN
	 *	@return ip58041TridN
	 */
	public short getIp58041TridN() throws CFException {
        if (isIp58041TridNModified()) { 
           ip58041TridN = refreshIp58041TridN();
        }
   		return ip58041TridN;
	}
	
	/**
	 * 	Update Ip58041TridN with the passed value
	 *  Corresponding COBOL Variable is IP58041-TRID-N
	 *	@param number
	 */
	public void setIp58041TridN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip58041TridN = checkIp58041TridNMaxLimit(number); 
		serializeIp58041TridN(ip58041TridN);
	}

	public void setIp58041TridN(int number) {
	    number = checkIp58041TridNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp58041TridN((short)number);
	}
	public void setIp58041TridN(long number) {
	    number = checkIp58041TridNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp58041TridN((short)number);
	}
	

	public short getIp58041TokenAsrLvlNum() throws CFException {
        if (isIp58041TokenAsrLvlNumModified()) { 
           ip58041TokenAsrLvlNum = refreshIp58041TokenAsrLvlNum();
        }
   		return ip58041TokenAsrLvlNum;
	}
	
	/**
	 * 	Update Ip58041TokenAsrLvlNum with the passed value
	 *  Corresponding COBOL Variable is IP58041-TOKEN-ASR-LVL-NUM
	 *	@param number
	 */
	public void setIp58041TokenAsrLvlNum(short number) {
			ip58041TokenAsrLvlNum = checkIp58041TokenAsrLvlNumMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIp58041TokenAsrLvlNum(ip58041TokenAsrLvlNum);
	}

	public void setIp58041TokenAsrLvlNum(int number) {
	    number = checkIp58041TokenAsrLvlNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp58041TokenAsrLvlNum((short)number);
	}
	public void setIp58041TokenAsrLvlNum(long number) {
	    number = checkIp58041TokenAsrLvlNumMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp58041TokenAsrLvlNum((short)number);
	}
	

	/**
	 *	Returns the value of ip58041TokenAsrLvlNumN
	 *	@return ip58041TokenAsrLvlNumN
	 */
	public short getIp58041TokenAsrLvlNumN() throws CFException {
        if (isIp58041TokenAsrLvlNumNModified()) { 
           ip58041TokenAsrLvlNumN = refreshIp58041TokenAsrLvlNumN();
        }
   		return ip58041TokenAsrLvlNumN;
	}
	
	/**
	 * 	Update Ip58041TokenAsrLvlNumN with the passed value
	 *  Corresponding COBOL Variable is IP58041-TOKEN-ASR-LVL-NUM-N
	 *	@param number
	 */
	public void setIp58041TokenAsrLvlNumN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip58041TokenAsrLvlNumN = checkIp58041TokenAsrLvlNumNMaxLimit(number); 
		serializeIp58041TokenAsrLvlNumN(ip58041TokenAsrLvlNumN);
	}

	public void setIp58041TokenAsrLvlNumN(int number) {
	    number = checkIp58041TokenAsrLvlNumNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp58041TokenAsrLvlNumN((short)number);
	}
	public void setIp58041TokenAsrLvlNumN(long number) {
	    number = checkIp58041TokenAsrLvlNumNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp58041TokenAsrLvlNumN((short)number);
	}
	

	/**
	 *	Returns the value of ip58041Wid
	 *	@return ip58041Wid
	 */
   public char[] getIp58041Wid() throws CFException{
     if (isIp58041WidModified()) { 
        ip58041Wid = refreshIp58041Wid();
     }
   		return ip58041Wid;
   }

  
	/**
	*  set variable ip58041Wid
	*  Corresponding COBOL Variable is IP58041-WID
	*  @param value
	**/
   public void setIp58041Wid(char[] value) {
      ip58041Wid = checkIp58041WidConstraints(value);
      serializeIp58041Wid(ip58041Wid);
   } 

     /**
	 * 	Update Ip58041Wid 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp58041Wid(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp58041Wid,ip58041Wid.length);
   	
   }
   
   public void setIp58041Wid(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041Wid,ip58041Wid.length);
   	
   }
   
     /**
	 * 	Update Ip58041Wid 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp58041Wid(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041Wid+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip58041Wid with another Field
	 *	@param value
	 */
   public void setIp58041Wid(Field source) {
       replace(source,0,source.length(),beginIp58041Wid,IP_58041_WID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip58041Wid 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp58041Wid(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp58041Wid,IP_58041_WID_LEN);
   	
   }
   
     /**
	 * 	Update Ip58041Wid 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp58041Wid(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041Wid+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip58041WidN
	 *	@return ip58041WidN
	 */
	public short getIp58041WidN() throws CFException {
        if (isIp58041WidNModified()) { 
           ip58041WidN = refreshIp58041WidN();
        }
   		return ip58041WidN;
	}
	
	/**
	 * 	Update Ip58041WidN with the passed value
	 *  Corresponding COBOL Variable is IP58041-WID-N
	 *	@param number
	 */
	public void setIp58041WidN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip58041WidN = checkIp58041WidNMaxLimit(number); 
		serializeIp58041WidN(ip58041WidN);
	}

	public void setIp58041WidN(int number) {
	    number = checkIp58041WidNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp58041WidN((short)number);
	}
	public void setIp58041WidN(long number) {
	    number = checkIp58041WidNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp58041WidN((short)number);
	}
	

	/**
	 *	Returns the value of ip58041PrimAcctSeqNum
	 *	@return ip58041PrimAcctSeqNum
	 */
   public char[] getIp58041PrimAcctSeqNum() throws CFException{
     if (isIp58041PrimAcctSeqNumModified()) { 
        ip58041PrimAcctSeqNum = refreshIp58041PrimAcctSeqNum();
     }
   		return ip58041PrimAcctSeqNum;
   }

  
	/**
	*  set variable ip58041PrimAcctSeqNum
	*  Corresponding COBOL Variable is IP58041-PRIM-ACCT-SEQ-NUM
	*  @param value
	**/
   public void setIp58041PrimAcctSeqNum(char[] value) {
      ip58041PrimAcctSeqNum = checkIp58041PrimAcctSeqNumConstraints(value);
      serializeIp58041PrimAcctSeqNum(ip58041PrimAcctSeqNum);
   } 

     /**
	 * 	Update Ip58041PrimAcctSeqNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp58041PrimAcctSeqNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp58041PrimAcctSeqNum,ip58041PrimAcctSeqNum.length);
   	
   }
   
   public void setIp58041PrimAcctSeqNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041PrimAcctSeqNum,ip58041PrimAcctSeqNum.length);
   	
   }
   
     /**
	 * 	Update Ip58041PrimAcctSeqNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp58041PrimAcctSeqNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041PrimAcctSeqNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip58041PrimAcctSeqNum with another Field
	 *	@param value
	 */
   public void setIp58041PrimAcctSeqNum(Field source) {
       replace(source,0,source.length(),beginIp58041PrimAcctSeqNum,IP_58041_PRIM_ACCT_SEQ_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update Ip58041PrimAcctSeqNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp58041PrimAcctSeqNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp58041PrimAcctSeqNum,IP_58041_PRIM_ACCT_SEQ_NUM_LEN);
   	
   }
   
     /**
	 * 	Update Ip58041PrimAcctSeqNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp58041PrimAcctSeqNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041PrimAcctSeqNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip58041PrimAcctSeqNumN
	 *	@return ip58041PrimAcctSeqNumN
	 */
	public short getIp58041PrimAcctSeqNumN() throws CFException {
        if (isIp58041PrimAcctSeqNumNModified()) { 
           ip58041PrimAcctSeqNumN = refreshIp58041PrimAcctSeqNumN();
        }
   		return ip58041PrimAcctSeqNumN;
	}
	
	/**
	 * 	Update Ip58041PrimAcctSeqNumN with the passed value
	 *  Corresponding COBOL Variable is IP58041-PRIM-ACCT-SEQ-NUM-N
	 *	@param number
	 */
	public void setIp58041PrimAcctSeqNumN(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip58041PrimAcctSeqNumN = checkIp58041PrimAcctSeqNumNMaxLimit(number); 
		serializeIp58041PrimAcctSeqNumN(ip58041PrimAcctSeqNumN);
	}

	public void setIp58041PrimAcctSeqNumN(int number) {
	    number = checkIp58041PrimAcctSeqNumNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp58041PrimAcctSeqNumN((short)number);
	}
	public void setIp58041PrimAcctSeqNumN(long number) {
	    number = checkIp58041PrimAcctSeqNumNMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp58041PrimAcctSeqNumN((short)number);
	}
	

	/**
	 *	Returns the value of ip58041PrcssngAgrmntId
	 *	@return ip58041PrcssngAgrmntId
	 */
   public char[] getIp58041PrcssngAgrmntId() throws CFException{
     if (isIp58041PrcssngAgrmntIdModified()) { 
        ip58041PrcssngAgrmntId = refreshIp58041PrcssngAgrmntId();
     }
   		return ip58041PrcssngAgrmntId;
   }

  
	/**
	*  set variable ip58041PrcssngAgrmntId
	*  Corresponding COBOL Variable is IP58041-PRCSSNG-AGRMNT-ID
	*  @param value
	**/
   public void setIp58041PrcssngAgrmntId(char[] value) {
      ip58041PrcssngAgrmntId = checkIp58041PrcssngAgrmntIdConstraints(value);
      serializeIp58041PrcssngAgrmntId(ip58041PrcssngAgrmntId);
   } 

     /**
	 * 	Update Ip58041PrcssngAgrmntId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp58041PrcssngAgrmntId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp58041PrcssngAgrmntId,ip58041PrcssngAgrmntId.length);
   	
   }
   
   public void setIp58041PrcssngAgrmntId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041PrcssngAgrmntId,ip58041PrcssngAgrmntId.length);
   	
   }
   
     /**
	 * 	Update Ip58041PrcssngAgrmntId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp58041PrcssngAgrmntId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041PrcssngAgrmntId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip58041PrcssngAgrmntId with another Field
	 *	@param value
	 */
   public void setIp58041PrcssngAgrmntId(Field source) {
       replace(source,0,source.length(),beginIp58041PrcssngAgrmntId,IP_58041_PRCSSNG_AGRMNT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip58041PrcssngAgrmntId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp58041PrcssngAgrmntId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp58041PrcssngAgrmntId,IP_58041_PRCSSNG_AGRMNT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip58041PrcssngAgrmntId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp58041PrcssngAgrmntId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041PrcssngAgrmntId+targetIndex,targetLen);
    
   }
	char[] ip58041PrcsGlobal8888Value = "GLOBAL     ".toCharArray();
	/**
	 *	Test condition "GLOBAL" for isIp58041PrcsGlobal88()
	 *	@return  Returns true if isIp58041PrcsGlobal88() is "GLOBAL"
	 */
   public boolean isIp58041PrcsGlobal88() throws CFException {
      return (  compareChars( getIp58041PrcssngAgrmntId() , ip58041PrcsGlobal8888Value)  == 0  );
   }


	/**
	*  set values "GLOBAL"
	*/
   	public void setIp58041PrcsGlobal88True() {  			
    	setIp58041PrcssngAgrmntId( ip58041PrcsGlobal8888Value);
   	}
	char[] ip58041PrcsLprus8888Value = "LPRUS      ".toCharArray();
	/**
	 *	Test condition "LPRUS" for isIp58041PrcsLprus88()
	 *	@return  Returns true if isIp58041PrcsLprus88() is "LPRUS"
	 */
   public boolean isIp58041PrcsLprus88() throws CFException {
      return (  compareChars( getIp58041PrcssngAgrmntId() , ip58041PrcsLprus8888Value)  == 0  );
   }


	/**
	*  set values "LPRUS"
	*/
   	public void setIp58041PrcsLprus88True() {  			
    	setIp58041PrcssngAgrmntId( ip58041PrcsLprus8888Value);
   	}
	char[] ip58041PrcsLpidn8888Value = "LPIDN      ".toCharArray();
	/**
	 *	Test condition "LPIDN" for isIp58041PrcsLpidn88()
	 *	@return  Returns true if isIp58041PrcsLpidn88() is "LPIDN"
	 */
   public boolean isIp58041PrcsLpidn88() throws CFException {
      return (  compareChars( getIp58041PrcssngAgrmntId() , ip58041PrcsLpidn8888Value)  == 0  );
   }


	/**
	*  set values "LPIDN"
	*/
   	public void setIp58041PrcsLpidn88True() {  			
    	setIp58041PrcssngAgrmntId( ip58041PrcsLpidn8888Value);
   	}
	char[] ip58041PrcsRpnspk8888Value = "RPNSPK     ".toCharArray();
	/**
	 *	Test condition "RPNSPK" for isIp58041PrcsRpnspk88()
	 *	@return  Returns true if isIp58041PrcsRpnspk88() is "RPNSPK"
	 */
   public boolean isIp58041PrcsRpnspk88() throws CFException {
      return (  compareChars( getIp58041PrcssngAgrmntId() , ip58041PrcsRpnspk8888Value)  == 0  );
   }


	/**
	*  set values "RPNSPK"
	*/
   	public void setIp58041PrcsRpnspk88True() {  			
    	setIp58041PrcssngAgrmntId( ip58041PrcsRpnspk8888Value);
   	}
	/**
	 *	Returns the value of ip58041MqSentSw
	 *	@return ip58041MqSentSw
	 */
   public char[] getIp58041MqSentSw() throws CFException{
     if (isIp58041MqSentSwModified()) { 
        ip58041MqSentSw = refreshIp58041MqSentSw();
     }
   		return ip58041MqSentSw;
   }

  
	/**
	*  set variable ip58041MqSentSw
	*  Corresponding COBOL Variable is IP58041-MQ-SENT-SW
	*  @param value
	**/
   public void setIp58041MqSentSw(char[] value) {
      ip58041MqSentSw = checkIp58041MqSentSwConstraints(value);
      serializeIp58041MqSentSw(ip58041MqSentSw);
   } 

     /**
	 * 	Update Ip58041MqSentSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp58041MqSentSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp58041MqSentSw,ip58041MqSentSw.length);
   	
   }
   
   public void setIp58041MqSentSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041MqSentSw,ip58041MqSentSw.length);
   	
   }
   
     /**
	 * 	Update Ip58041MqSentSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp58041MqSentSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041MqSentSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip58041MqSentSw with another Field
	 *	@param value
	 */
   public void setIp58041MqSentSw(Field source) {
       replace(source,0,source.length(),beginIp58041MqSentSw,IP_58041_MQ_SENT_SW_LEN);
   	
   }  
   
     /**
	 * 	Update Ip58041MqSentSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp58041MqSentSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp58041MqSentSw,IP_58041_MQ_SENT_SW_LEN);
   	
   }
   
     /**
	 * 	Update Ip58041MqSentSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp58041MqSentSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp58041MqSentSw+targetIndex,targetLen);
    
   }
	char[] ip58041MqSentN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp58041MqSentN88()
	 *	@return  Returns true if isIp58041MqSentN88() is "N"
	 */
   public boolean isIp58041MqSentN88() throws CFException {
      return (  compareChars( getIp58041MqSentSw() , ip58041MqSentN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp58041MqSentN88True() {  			
    	setIp58041MqSentSw( ip58041MqSentN8888Value);
   	}
	char[] ip58041MqSentY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp58041MqSentY88()
	 *	@return  Returns true if isIp58041MqSentY88() is "Y"
	 */
   public boolean isIp58041MqSentY88() throws CFException {
      return (  compareChars( getIp58041MqSentSw() , ip58041MqSentY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp58041MqSentY88True() {  			
    	setIp58041MqSentSw( ip58041MqSentY8888Value);
   	}

	
	
	
	/**
	 * 	initializes Ip58041Tipapma
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp58041VirtualAccountNbr(CONSTANTS.SPACE_19);
          ip58041CreateUpdateTs.initialize();
     
         setIp58041PrimAccountNbr(CONSTANTS.SPACE_19);
         setIp58041ActionCode(CONSTANTS.SPACE);
         setIp58041ObsAccessTs(CONSTANTS.SPACE_26);
         	setIp58041ObsAccessTsN((short)0);
         setIp58041EntRsnCd(CONSTANTS.SPACE);
         setIp58041StatCd(CONSTANTS.SPACE);
         setIp58041TokenTypeCd(CONSTANTS.SPACE);
         setIp58041PartnId(CONSTANTS.SPACE_3);
                     setIp58041Trid(0);
         	setIp58041TridN((short)0);
         	setIp58041TokenAsrLvlNum((short)0);
         	setIp58041TokenAsrLvlNumN((short)0);
         setIp58041Wid(CONSTANTS.SPACE_3);
         	setIp58041WidN((short)0);
         setIp58041PrimAcctSeqNum(CONSTANTS.SPACE_3);
         	setIp58041PrimAcctSeqNumN((short)0);
         setIp58041PrcssngAgrmntId(CONSTANTS.SPACE_11);
         setIp58041MqSentSw(CONSTANTS.SPACE);
   }

		public static int getIp58041TipapmaFieldLength() {
			return IP_58041_TIPAPMA_LENGTH;
		}

}
  

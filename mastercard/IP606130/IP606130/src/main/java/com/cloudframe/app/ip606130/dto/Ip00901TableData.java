package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00901TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:17. using version 5.0.0.257
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip00901TableData extends Ip00901TableDataSerialized { 
   

						private char[] ip00901BsAccRngL = Field.fillLowValue(19);

						private char[] ip00901BsArBusSrvLvl = Field.fillLowValue(1);

						private char[] ip00901BsArBusSrvId = Field.fillLowValue(6);

						private char[] ip00901BsArAccBrand = Field.fillLowValue(3);

						private char[] ip00901BsAccRngH = Field.fillLowValue(19);

								private int ip00901BsArBsPriority;

								private int ip00901BsArAbPriority;

						private char[] ip00901BsArLifecylInd = Field.fillLowValue(1);

						private char[] ip00901BsArBsseCd = Field.fillLowValue(1);

						private char[] ip00901Filler = Field.fillLowValue(7);
	
	/**
	* Constructor for Ip00901TableData
	**/
    public Ip00901TableData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00901TableData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00901TableData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00901BsAccRngL
	 *	@return ip00901BsAccRngL
	 */
   public char[] getIp00901BsAccRngL() throws CFException{
     if (isIp00901BsAccRngLModified()) { 
        ip00901BsAccRngL = refreshIp00901BsAccRngL();
     }
   		return ip00901BsAccRngL;
   }

  
	/**
	*  set variable ip00901BsAccRngL
	*  Corresponding COBOL Variable is IP00901-BS-ACC-RNG-L
	*  @param value
	**/
   public void setIp00901BsAccRngL(char[] value) {
      ip00901BsAccRngL = checkIp00901BsAccRngLConstraints(value);
      serializeIp00901BsAccRngL(ip00901BsAccRngL);
   } 

     /**
	 * 	Update Ip00901BsAccRngL 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00901BsAccRngL(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00901BsAccRngL,ip00901BsAccRngL.length);
   	
   }
   
   public void setIp00901BsAccRngL(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsAccRngL,ip00901BsAccRngL.length);
   	
   }
   
     /**
	 * 	Update Ip00901BsAccRngL 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00901BsAccRngL(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsAccRngL+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00901BsAccRngL with another Field
	 *	@param value
	 */
   public void setIp00901BsAccRngL(Field source) {
       replace(source,0,source.length(),beginIp00901BsAccRngL,IP_00901_BS_ACC_RNG_L_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00901BsAccRngL 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00901BsAccRngL(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00901BsAccRngL,IP_00901_BS_ACC_RNG_L_LEN);
   	
   }
   
     /**
	 * 	Update Ip00901BsAccRngL 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00901BsAccRngL(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsAccRngL+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00901BsArBusSrvLvl
	 *	@return ip00901BsArBusSrvLvl
	 */
   public char[] getIp00901BsArBusSrvLvl() throws CFException{
     if (isIp00901BsArBusSrvLvlModified()) { 
        ip00901BsArBusSrvLvl = refreshIp00901BsArBusSrvLvl();
     }
   		return ip00901BsArBusSrvLvl;
   }

  
	/**
	*  set variable ip00901BsArBusSrvLvl
	*  Corresponding COBOL Variable is IP00901-BS-AR-BUS-SRV-LVL
	*  @param value
	**/
   public void setIp00901BsArBusSrvLvl(char[] value) {
      ip00901BsArBusSrvLvl = checkIp00901BsArBusSrvLvlConstraints(value);
      serializeIp00901BsArBusSrvLvl(ip00901BsArBusSrvLvl);
   } 

     /**
	 * 	Update Ip00901BsArBusSrvLvl 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00901BsArBusSrvLvl(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00901BsArBusSrvLvl,ip00901BsArBusSrvLvl.length);
   	
   }
   
   public void setIp00901BsArBusSrvLvl(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsArBusSrvLvl,ip00901BsArBusSrvLvl.length);
   	
   }
   
     /**
	 * 	Update Ip00901BsArBusSrvLvl 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00901BsArBusSrvLvl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsArBusSrvLvl+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00901BsArBusSrvLvl with another Field
	 *	@param value
	 */
   public void setIp00901BsArBusSrvLvl(Field source) {
       replace(source,0,source.length(),beginIp00901BsArBusSrvLvl,IP_00901_BS_AR_BUS_SRV_LVL_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00901BsArBusSrvLvl 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00901BsArBusSrvLvl(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00901BsArBusSrvLvl,IP_00901_BS_AR_BUS_SRV_LVL_LEN);
   	
   }
   
     /**
	 * 	Update Ip00901BsArBusSrvLvl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00901BsArBusSrvLvl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsArBusSrvLvl+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00901BsArBusSrvId
	 *	@return ip00901BsArBusSrvId
	 */
   public char[] getIp00901BsArBusSrvId() throws CFException{
     if (isIp00901BsArBusSrvIdModified()) { 
        ip00901BsArBusSrvId = refreshIp00901BsArBusSrvId();
     }
   		return ip00901BsArBusSrvId;
   }

  
	/**
	*  set variable ip00901BsArBusSrvId
	*  Corresponding COBOL Variable is IP00901-BS-AR-BUS-SRV-ID
	*  @param value
	**/
   public void setIp00901BsArBusSrvId(char[] value) {
      ip00901BsArBusSrvId = checkIp00901BsArBusSrvIdConstraints(value);
      serializeIp00901BsArBusSrvId(ip00901BsArBusSrvId);
   } 

     /**
	 * 	Update Ip00901BsArBusSrvId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00901BsArBusSrvId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00901BsArBusSrvId,ip00901BsArBusSrvId.length);
   	
   }
   
   public void setIp00901BsArBusSrvId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsArBusSrvId,ip00901BsArBusSrvId.length);
   	
   }
   
     /**
	 * 	Update Ip00901BsArBusSrvId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00901BsArBusSrvId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsArBusSrvId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00901BsArBusSrvId with another Field
	 *	@param value
	 */
   public void setIp00901BsArBusSrvId(Field source) {
       replace(source,0,source.length(),beginIp00901BsArBusSrvId,IP_00901_BS_AR_BUS_SRV_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00901BsArBusSrvId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00901BsArBusSrvId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00901BsArBusSrvId,IP_00901_BS_AR_BUS_SRV_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip00901BsArBusSrvId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00901BsArBusSrvId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsArBusSrvId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00901BsArAccBrand
	 *	@return ip00901BsArAccBrand
	 */
   public char[] getIp00901BsArAccBrand() throws CFException{
     if (isIp00901BsArAccBrandModified()) { 
        ip00901BsArAccBrand = refreshIp00901BsArAccBrand();
     }
   		return ip00901BsArAccBrand;
   }

  
	/**
	*  set variable ip00901BsArAccBrand
	*  Corresponding COBOL Variable is IP00901-BS-AR-ACC-BRAND
	*  @param value
	**/
   public void setIp00901BsArAccBrand(char[] value) {
      ip00901BsArAccBrand = checkIp00901BsArAccBrandConstraints(value);
      serializeIp00901BsArAccBrand(ip00901BsArAccBrand);
   } 

     /**
	 * 	Update Ip00901BsArAccBrand 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00901BsArAccBrand(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00901BsArAccBrand,ip00901BsArAccBrand.length);
   	
   }
   
   public void setIp00901BsArAccBrand(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsArAccBrand,ip00901BsArAccBrand.length);
   	
   }
   
     /**
	 * 	Update Ip00901BsArAccBrand 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00901BsArAccBrand(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsArAccBrand+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00901BsArAccBrand with another Field
	 *	@param value
	 */
   public void setIp00901BsArAccBrand(Field source) {
       replace(source,0,source.length(),beginIp00901BsArAccBrand,IP_00901_BS_AR_ACC_BRAND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00901BsArAccBrand 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00901BsArAccBrand(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00901BsArAccBrand,IP_00901_BS_AR_ACC_BRAND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00901BsArAccBrand 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00901BsArAccBrand(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsArAccBrand+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00901BsAccRngH
	 *	@return ip00901BsAccRngH
	 */
   public char[] getIp00901BsAccRngH() throws CFException{
     if (isIp00901BsAccRngHModified()) { 
        ip00901BsAccRngH = refreshIp00901BsAccRngH();
     }
   		return ip00901BsAccRngH;
   }

  
	/**
	*  set variable ip00901BsAccRngH
	*  Corresponding COBOL Variable is IP00901-BS-ACC-RNG-H
	*  @param value
	**/
   public void setIp00901BsAccRngH(char[] value) {
      ip00901BsAccRngH = checkIp00901BsAccRngHConstraints(value);
      serializeIp00901BsAccRngH(ip00901BsAccRngH);
   } 

     /**
	 * 	Update Ip00901BsAccRngH 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00901BsAccRngH(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00901BsAccRngH,ip00901BsAccRngH.length);
   	
   }
   
   public void setIp00901BsAccRngH(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsAccRngH,ip00901BsAccRngH.length);
   	
   }
   
     /**
	 * 	Update Ip00901BsAccRngH 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00901BsAccRngH(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsAccRngH+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00901BsAccRngH with another Field
	 *	@param value
	 */
   public void setIp00901BsAccRngH(Field source) {
       replace(source,0,source.length(),beginIp00901BsAccRngH,IP_00901_BS_ACC_RNG_H_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00901BsAccRngH 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00901BsAccRngH(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00901BsAccRngH,IP_00901_BS_ACC_RNG_H_LEN);
   	
   }
   
     /**
	 * 	Update Ip00901BsAccRngH 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00901BsAccRngH(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsAccRngH+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00901BsArBsPriority
	 *	@return ip00901BsArBsPriority
	 */
	public int getIp00901BsArBsPriority() throws CFException {
       if (isIp00901BsArBsPriorityModified()) { 
           ip00901BsArBsPriority = refreshIp00901BsArBsPriority();
        }
   		return ip00901BsArBsPriority;
	}
	

	
	   
	/**
	 * 	Update Ip00901BsArBsPriority with the passed value
	 *  Corresponding COBOL Variable is IP00901-BS-AR-BS-PRIORITY
	 *	@param number
	 */
	public void setIp00901BsArBsPriority(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00901BsArBsPriority = checkIp00901BsArBsPriorityMaxLimit(number); 
		serializeIp00901BsArBsPriority(ip00901BsArBsPriority);
	}
	

	public void setIp00901BsArBsPriority(long number) {
	    number = checkIp00901BsArBsPriorityMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00901BsArBsPriority((int)number);
	}
	
	/**
	 * 	Update Ip00901BsArBsPriority with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00901BsArBsPriority(char[] value) throws CFException {
		 ip00901BsArBsPriority = serializeIp00901BsArBsPriority(value);
	}
	/**
	 * 	Update Ip00901BsArBsPriority with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00901BsArBsPriorityString(char[] value) throws CFException {
		 setIp00901BsArBsPriority(value);
	}
	/**
	 *	Returns the value of ip00901BsArAbPriority
	 *	@return ip00901BsArAbPriority
	 */
	public int getIp00901BsArAbPriority() throws CFException {
       if (isIp00901BsArAbPriorityModified()) { 
           ip00901BsArAbPriority = refreshIp00901BsArAbPriority();
        }
   		return ip00901BsArAbPriority;
	}
	

	
	   
	/**
	 * 	Update Ip00901BsArAbPriority with the passed value
	 *  Corresponding COBOL Variable is IP00901-BS-AR-AB-PRIORITY
	 *	@param number
	 */
	public void setIp00901BsArAbPriority(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00901BsArAbPriority = checkIp00901BsArAbPriorityMaxLimit(number); 
		serializeIp00901BsArAbPriority(ip00901BsArAbPriority);
	}
	

	public void setIp00901BsArAbPriority(long number) {
	    number = checkIp00901BsArAbPriorityMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00901BsArAbPriority((int)number);
	}
	
	/**
	 * 	Update Ip00901BsArAbPriority with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00901BsArAbPriority(char[] value) throws CFException {
		 ip00901BsArAbPriority = serializeIp00901BsArAbPriority(value);
	}
	/**
	 * 	Update Ip00901BsArAbPriority with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00901BsArAbPriorityString(char[] value) throws CFException {
		 setIp00901BsArAbPriority(value);
	}
	/**
	 *	Returns the value of ip00901BsArLifecylInd
	 *	@return ip00901BsArLifecylInd
	 */
   public char[] getIp00901BsArLifecylInd() throws CFException{
     if (isIp00901BsArLifecylIndModified()) { 
        ip00901BsArLifecylInd = refreshIp00901BsArLifecylInd();
     }
   		return ip00901BsArLifecylInd;
   }

  
	/**
	*  set variable ip00901BsArLifecylInd
	*  Corresponding COBOL Variable is IP00901-BS-AR-LIFECYL-IND
	*  @param value
	**/
   public void setIp00901BsArLifecylInd(char[] value) {
      ip00901BsArLifecylInd = checkIp00901BsArLifecylIndConstraints(value);
      serializeIp00901BsArLifecylInd(ip00901BsArLifecylInd);
   } 

     /**
	 * 	Update Ip00901BsArLifecylInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00901BsArLifecylInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00901BsArLifecylInd,ip00901BsArLifecylInd.length);
   	
   }
   
   public void setIp00901BsArLifecylInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsArLifecylInd,ip00901BsArLifecylInd.length);
   	
   }
   
     /**
	 * 	Update Ip00901BsArLifecylInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00901BsArLifecylInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsArLifecylInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00901BsArLifecylInd with another Field
	 *	@param value
	 */
   public void setIp00901BsArLifecylInd(Field source) {
       replace(source,0,source.length(),beginIp00901BsArLifecylInd,IP_00901_BS_AR_LIFECYL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00901BsArLifecylInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00901BsArLifecylInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00901BsArLifecylInd,IP_00901_BS_AR_LIFECYL_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip00901BsArLifecylInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00901BsArLifecylInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsArLifecylInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00901BsArBsseCd
	 *	@return ip00901BsArBsseCd
	 */
   public char[] getIp00901BsArBsseCd() throws CFException{
     if (isIp00901BsArBsseCdModified()) { 
        ip00901BsArBsseCd = refreshIp00901BsArBsseCd();
     }
   		return ip00901BsArBsseCd;
   }

  
	/**
	*  set variable ip00901BsArBsseCd
	*  Corresponding COBOL Variable is IP00901-BS-AR-BSSE-CD
	*  @param value
	**/
   public void setIp00901BsArBsseCd(char[] value) {
      ip00901BsArBsseCd = checkIp00901BsArBsseCdConstraints(value);
      serializeIp00901BsArBsseCd(ip00901BsArBsseCd);
   } 

     /**
	 * 	Update Ip00901BsArBsseCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00901BsArBsseCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00901BsArBsseCd,ip00901BsArBsseCd.length);
   	
   }
   
   public void setIp00901BsArBsseCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsArBsseCd,ip00901BsArBsseCd.length);
   	
   }
   
     /**
	 * 	Update Ip00901BsArBsseCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00901BsArBsseCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsArBsseCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00901BsArBsseCd with another Field
	 *	@param value
	 */
   public void setIp00901BsArBsseCd(Field source) {
       replace(source,0,source.length(),beginIp00901BsArBsseCd,IP_00901_BS_AR_BSSE_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00901BsArBsseCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00901BsArBsseCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00901BsArBsseCd,IP_00901_BS_AR_BSSE_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip00901BsArBsseCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00901BsArBsseCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901BsArBsseCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip00901Filler
	 *	@return ip00901Filler
	 */
   public char[] getIp00901Filler() throws CFException{
     if (isIp00901FillerModified()) { 
        ip00901Filler = refreshIp00901Filler();
     }
   		return ip00901Filler;
   }

  
	/**
	*  set variable ip00901Filler
	*  Corresponding COBOL Variable is IP00901-FILLER
	*  @param value
	**/
   public void setIp00901Filler(char[] value) {
      ip00901Filler = checkIp00901FillerConstraints(value);
      serializeIp00901Filler(ip00901Filler);
   } 

     /**
	 * 	Update Ip00901Filler 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00901Filler(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00901Filler,ip00901Filler.length);
   	
   }
   
   public void setIp00901Filler(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901Filler,ip00901Filler.length);
   	
   }
   
     /**
	 * 	Update Ip00901Filler 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00901Filler(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901Filler+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00901Filler with another Field
	 *	@param value
	 */
   public void setIp00901Filler(Field source) {
       replace(source,0,source.length(),beginIp00901Filler,IP_00901_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00901Filler 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00901Filler(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00901Filler,IP_00901_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip00901Filler 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00901Filler(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00901Filler+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip00901TableData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp00901BsAccRngL(CONSTANTS.SPACE_19);
         setIp00901BsArBusSrvLvl(CONSTANTS.SPACE);
         setIp00901BsArBusSrvId(CONSTANTS.SPACE_6);
         setIp00901BsArAccBrand(CONSTANTS.SPACE_3);
         setIp00901BsAccRngH(CONSTANTS.SPACE_19);
                     setIp00901BsArBsPriority(0);
                     setIp00901BsArAbPriority(0);
         setIp00901BsArLifecylInd(CONSTANTS.SPACE);
         setIp00901BsArBsseCd(CONSTANTS.SPACE);
         setIp00901Filler(CONSTANTS.SPACE_7);
   }

		public static int getIp00901TableDataFieldLength() {
			return IP_00901_TABLE_DATA_LENGTH;
		}

}
  

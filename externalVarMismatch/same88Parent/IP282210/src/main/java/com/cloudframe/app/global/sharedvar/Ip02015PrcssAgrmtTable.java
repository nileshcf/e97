package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02015PrcssAgrmtTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:10. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_ip02015PrcssAgrmtTable")

public class Ip02015PrcssAgrmtTable extends Ip02015PrcssAgrmtTableSerialized  implements InitializingBean {
   

								private int ip02015PasFoundCount;

						private char[] ip02015HostPrcssAgrmtId = Field.fillLowValue(11);

						private char[] ip02015HostGeoScopeCode = Field.fillLowValue(1);

						private char[] ip02015HostClrPrcssCd = Field.fillLowValue(4);
				private Ip02015PrcssAgrmtTabEnt ip02015PrcssAgrmtTabEnt = new Ip02015PrcssAgrmtTabEnt();
	
	/**
	* Constructor for Ip02015PrcssAgrmtTable
	**/
    public Ip02015PrcssAgrmtTable() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip02015PrcssAgrmtTabEnt.setParent(this,getStartOffset() + 20);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip02015PasFoundCount
	 *	@return ip02015PasFoundCount
	 */
	public int getIp02015PasFoundCount() throws CFException {
        if (isIp02015PasFoundCountModified()) { 
           ip02015PasFoundCount = refreshIp02015PasFoundCount();
        }
   		return ip02015PasFoundCount;
	}
	
	/**
	 * 	Update Ip02015PasFoundCount with the passed value
	 *  Corresponding COBOL Variable is IP02015-PAS-FOUND-COUNT
	 *	@param number
	 */
	public void setIp02015PasFoundCount(int number) {
	     // Truncate if the number is beyond +/- Max range
	    ip02015PasFoundCount = checkIp02015PasFoundCountMaxLimit(number); 
		serializeIp02015PasFoundCount(ip02015PasFoundCount);
	}


	public void setIp02015PasFoundCount(long number) {
	    number = checkIp02015PasFoundCountMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp02015PasFoundCount((int)number);
	}
	
	/**
	 *	Returns the value of ip02015HostPrcssAgrmtId
	 *	@return ip02015HostPrcssAgrmtId
	 */
   public char[] getIp02015HostPrcssAgrmtId() throws CFException{
     if (isIp02015HostPrcssAgrmtIdModified()) { 
        ip02015HostPrcssAgrmtId = refreshIp02015HostPrcssAgrmtId();
     }
   		return ip02015HostPrcssAgrmtId;
   }

  
	/**
	*  set variable ip02015HostPrcssAgrmtId
	*  Corresponding COBOL Variable is IP02015-HOST-PRCSS-AGRMT-ID
	*  @param value
	**/
   public void setIp02015HostPrcssAgrmtId(char[] value) {
      ip02015HostPrcssAgrmtId = checkIp02015HostPrcssAgrmtIdConstraints(value);
      serializeIp02015HostPrcssAgrmtId(ip02015HostPrcssAgrmtId);
   } 

     /**
	 * 	Update Ip02015HostPrcssAgrmtId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015HostPrcssAgrmtId,ip02015HostPrcssAgrmtId.length);
   	
   }
   
   public void setIp02015HostPrcssAgrmtId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015HostPrcssAgrmtId,ip02015HostPrcssAgrmtId.length);
   	
   }
   
     /**
	 * 	Update Ip02015HostPrcssAgrmtId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015HostPrcssAgrmtId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015HostPrcssAgrmtId with another Field
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(Field source) {
       replace(source,0,source.length(),beginIp02015HostPrcssAgrmtId,IP_02015_HOST_PRCSS_AGRMT_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015HostPrcssAgrmtId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015HostPrcssAgrmtId,IP_02015_HOST_PRCSS_AGRMT_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015HostPrcssAgrmtId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostPrcssAgrmtId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015HostPrcssAgrmtId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip02015HostGeoScopeCode
	 *	@return ip02015HostGeoScopeCode
	 */
   public char[] getIp02015HostGeoScopeCode() throws CFException{
     if (isIp02015HostGeoScopeCodeModified()) { 
        ip02015HostGeoScopeCode = refreshIp02015HostGeoScopeCode();
     }
   		return ip02015HostGeoScopeCode;
   }

  
	/**
	*  set variable ip02015HostGeoScopeCode
	*  Corresponding COBOL Variable is IP02015-HOST-GEO-SCOPE-CODE
	*  @param value
	**/
   public void setIp02015HostGeoScopeCode(char[] value) {
      ip02015HostGeoScopeCode = checkIp02015HostGeoScopeCodeConstraints(value);
      serializeIp02015HostGeoScopeCode(ip02015HostGeoScopeCode);
   } 

     /**
	 * 	Update Ip02015HostGeoScopeCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015HostGeoScopeCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015HostGeoScopeCode,ip02015HostGeoScopeCode.length);
   	
   }
   
   public void setIp02015HostGeoScopeCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015HostGeoScopeCode,ip02015HostGeoScopeCode.length);
   	
   }
   
     /**
	 * 	Update Ip02015HostGeoScopeCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostGeoScopeCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015HostGeoScopeCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015HostGeoScopeCode with another Field
	 *	@param value
	 */
   public void setIp02015HostGeoScopeCode(Field source) {
       replace(source,0,source.length(),beginIp02015HostGeoScopeCode,IP_02015_HOST_GEO_SCOPE_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015HostGeoScopeCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015HostGeoScopeCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015HostGeoScopeCode,IP_02015_HOST_GEO_SCOPE_CODE_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015HostGeoScopeCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostGeoScopeCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015HostGeoScopeCode+targetIndex,targetLen);
    
   }
	char[] ip02015HostPaGlobal8888Value = "G".toCharArray();
	/**
	 *	Test condition "G" for isIp02015HostPaGlobal88()
	 *	@return  Returns true if isIp02015HostPaGlobal88() is "G"
	 */
   public boolean isIp02015HostPaGlobal88() throws CFException {
      return (  compareChars( getIp02015HostGeoScopeCode() , ip02015HostPaGlobal8888Value)  == 0  );
   }


	/**
	*  set values "G"
	*/
   	public void setIp02015HostPaGlobal88True() {  			
    	setIp02015HostGeoScopeCode( ip02015HostPaGlobal8888Value);
   	}
	char[] ip02015HostPaLocal8888Value = "L".toCharArray();
	/**
	 *	Test condition "L" for isIp02015HostPaLocal88()
	 *	@return  Returns true if isIp02015HostPaLocal88() is "L"
	 */
   public boolean isIp02015HostPaLocal88() throws CFException {
      return (  compareChars( getIp02015HostGeoScopeCode() , ip02015HostPaLocal8888Value)  == 0  );
   }


	/**
	*  set values "L"
	*/
   	public void setIp02015HostPaLocal88True() {  			
    	setIp02015HostGeoScopeCode( ip02015HostPaLocal8888Value);
   	}
	char[] ip02015HostPaRegional8888Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isIp02015HostPaRegional88()
	 *	@return  Returns true if isIp02015HostPaRegional88() is "R"
	 */
   public boolean isIp02015HostPaRegional88() throws CFException {
      return (  compareChars( getIp02015HostGeoScopeCode() , ip02015HostPaRegional8888Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setIp02015HostPaRegional88True() {  			
    	setIp02015HostGeoScopeCode( ip02015HostPaRegional8888Value);
   	}
	/**
	 *	Returns the value of ip02015HostClrPrcssCd
	 *	@return ip02015HostClrPrcssCd
	 */
   public char[] getIp02015HostClrPrcssCd() throws CFException{
     if (isIp02015HostClrPrcssCdModified()) { 
        ip02015HostClrPrcssCd = refreshIp02015HostClrPrcssCd();
     }
   		return ip02015HostClrPrcssCd;
   }

  
	/**
	*  set variable ip02015HostClrPrcssCd
	*  Corresponding COBOL Variable is IP02015-HOST-CLR-PRCSS-CD
	*  @param value
	**/
   public void setIp02015HostClrPrcssCd(char[] value) {
      ip02015HostClrPrcssCd = checkIp02015HostClrPrcssCdConstraints(value);
      serializeIp02015HostClrPrcssCd(ip02015HostClrPrcssCd);
   } 

     /**
	 * 	Update Ip02015HostClrPrcssCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp02015HostClrPrcssCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp02015HostClrPrcssCd,ip02015HostClrPrcssCd.length);
   	
   }
   
   public void setIp02015HostClrPrcssCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015HostClrPrcssCd,ip02015HostClrPrcssCd.length);
   	
   }
   
     /**
	 * 	Update Ip02015HostClrPrcssCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostClrPrcssCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015HostClrPrcssCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip02015HostClrPrcssCd with another Field
	 *	@param value
	 */
   public void setIp02015HostClrPrcssCd(Field source) {
       replace(source,0,source.length(),beginIp02015HostClrPrcssCd,IP_02015_HOST_CLR_PRCSS_CD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip02015HostClrPrcssCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp02015HostClrPrcssCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp02015HostClrPrcssCd,IP_02015_HOST_CLR_PRCSS_CD_LEN);
   	
   }
   
     /**
	 * 	Update Ip02015HostClrPrcssCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015HostClrPrcssCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp02015HostClrPrcssCd+targetIndex,targetLen);
    
   }
	char[] ip02015HostGlobalPrcCd8888Value = "GCMS".toCharArray();
	/**
	 *	Test condition "GCMS" for isIp02015HostGlobalPrcCd88()
	 *	@return  Returns true if isIp02015HostGlobalPrcCd88() is "GCMS"
	 */
   public boolean isIp02015HostGlobalPrcCd88() throws CFException {
      return (  compareChars( getIp02015HostClrPrcssCd() , ip02015HostGlobalPrcCd8888Value)  == 0  );
   }


	/**
	*  set values "GCMS"
	*/
   	public void setIp02015HostGlobalPrcCd88True() {  			
    	setIp02015HostClrPrcssCd( ip02015HostGlobalPrcCd8888Value);
   	}
	char[] ip02015HostLocalPrcCd8888Value = "LCMS".toCharArray();
	/**
	 *	Test condition "LCMS" for isIp02015HostLocalPrcCd88()
	 *	@return  Returns true if isIp02015HostLocalPrcCd88() is "LCMS"
	 */
   public boolean isIp02015HostLocalPrcCd88() throws CFException {
      return (  compareChars( getIp02015HostClrPrcssCd() , ip02015HostLocalPrcCd8888Value)  == 0  );
   }


	/**
	*  set values "LCMS"
	*/
   	public void setIp02015HostLocalPrcCd88True() {  			
    	setIp02015HostClrPrcssCd( ip02015HostLocalPrcCd8888Value);
   	}
	char[] ip02015HostRedactPrcCd8888Value = "RCMS".toCharArray();
	/**
	 *	Test condition "RCMS" for isIp02015HostRedactPrcCd88()
	 *	@return  Returns true if isIp02015HostRedactPrcCd88() is "RCMS"
	 */
   public boolean isIp02015HostRedactPrcCd88() throws CFException {
      return (  compareChars( getIp02015HostClrPrcssCd() , ip02015HostRedactPrcCd8888Value)  == 0  );
   }


	/**
	*  set values "RCMS"
	*/
   	public void setIp02015HostRedactPrcCd88True() {  			
    	setIp02015HostClrPrcssCd( ip02015HostRedactPrcCd8888Value);
   	}
	/**
	 *	Returns the value of ip02015PrcssAgrmtTabEnt
	 *	@return ip02015PrcssAgrmtTabEnt
	 */   
	 public Ip02015PrcssAgrmtTabEnt getIp02015PrcssAgrmtTabEnt() {
   	return ip02015PrcssAgrmtTabEnt;
   }
   /**
	* 	Update Ip02015PrcssAgrmtTabEnt with the passed value
	*   Corresponding COBOL Variable is IP02015-PRCSS-AGRMT-TAB-ENT
	*	@param value
	*/
   public void setIp02015PrcssAgrmtTabEnt(char[] value) {
      ip02015PrcssAgrmtTabEnt.setString(value); 
   }   
    
     /**
	 * 	Update Ip02015PrcssAgrmtTabEnt 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtTabEnt(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02015PrcssAgrmtTabEnt.begin,ip02015PrcssAgrmtTabEnt.length());
   }
   
     /**
	 * 	Update Ip02015PrcssAgrmtTabEnt 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtTabEnt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02015PrcssAgrmtTabEnt.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip02015PrcssAgrmtTabEnt with another Field
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtTabEnt(Field source) {
   	replace(source,0,source.length(),ip02015PrcssAgrmtTabEnt.begin,ip02015PrcssAgrmtTabEnt.length());
   }  
   
     /**
	 * 	Update Ip02015PrcssAgrmtTabEnt 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtTabEnt(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip02015PrcssAgrmtTabEnt.begin,ip02015PrcssAgrmtTabEnt.length());
   }
   
     /**
	 * 	Update Ip02015PrcssAgrmtTabEnt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp02015PrcssAgrmtTabEnt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip02015PrcssAgrmtTabEnt.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip02015PrcssAgrmtTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp02015PasFoundCount(0);
         setIp02015HostPrcssAgrmtId(CONSTANTS.SPACE_11);
         setIp02015HostGeoScopeCode(CONSTANTS.SPACE);
         setIp02015HostClrPrcssCd(CONSTANTS.SPACE_4);
          ip02015PrcssAgrmtTabEnt.initialize();
     
   }

		public static int getIp02015PrcssAgrmtTableFieldLength() {
			return IP_02015_PRCSS_AGRMT_TABLE_LENGTH;
		}

}
  

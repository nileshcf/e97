package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip64801LrmCommBlock is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:15. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip64801LrmCommBlock")

public class Ip64801LrmCommBlock extends Ip64801LrmCommBlockSerialized  implements InitializingBean {
   

						private char[] ip64801LrmRequest = Field.fillLowValue(4);

						private char[] ip64801LrmJobgrpName = Field.fillLowValue(6);

								private int ip64801LrmJobgrpNum;

								private int ip64801LrmSelSqlCnt;
			private List<Ip64801LrmSelSqlDtl> ip64801LrmSelSqlDtl = new ArrayList<>();
    	

								private int ip64801LrmUpdComSql;

						private char[] ip64801LrmUpdComMod = Field.fillLowValue(8);

						private char[] ip64801LrmReqStat = Field.fillLowValue(3);

								private int ip64801LrmBadRsn;

						private char[] ip64801LrmJobgrpId = Field.fillLowValue(8);
	
	/**
	* Constructor for Ip64801LrmCommBlock
	**/
    public Ip64801LrmCommBlock() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_64801_LRM_SEL_SQL_DTL_SIZE;arrayIndex++) {
						ip64801LrmSelSqlDtl.add(new Ip64801LrmSelSqlDtl(this, beginIp64801LrmSelSqlDtl + 
						arrayIndex * Ip64801LrmSelSqlDtl.getIp64801LrmSelSqlDtlFieldLength()));
				}
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip64801LrmRequest
	 *	@return ip64801LrmRequest
	 */
   public char[] getIp64801LrmRequest() throws CFException{
     if (isIp64801LrmRequestModified()) { 
        ip64801LrmRequest = refreshIp64801LrmRequest();
     }
   		return ip64801LrmRequest;
   }

  
	/**
	*  set variable ip64801LrmRequest
	*  Corresponding COBOL Variable is IP64801-LRM-REQUEST
	*  @param value
	**/
   public void setIp64801LrmRequest(char[] value) {
      ip64801LrmRequest = checkIp64801LrmRequestConstraints(value);
      serializeIp64801LrmRequest(ip64801LrmRequest);
   } 

     /**
	 * 	Update Ip64801LrmRequest 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp64801LrmRequest(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp64801LrmRequest,ip64801LrmRequest.length);
   	
   }
   
   public void setIp64801LrmRequest(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp64801LrmRequest,ip64801LrmRequest.length);
   	
   }
   
     /**
	 * 	Update Ip64801LrmRequest 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp64801LrmRequest(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp64801LrmRequest+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip64801LrmRequest with another Field
	 *	@param value
	 */
   public void setIp64801LrmRequest(Field source) {
       replace(source,0,source.length(),beginIp64801LrmRequest,IP_64801_LRM_REQUEST_LEN);
   	
   }  
   
     /**
	 * 	Update Ip64801LrmRequest 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp64801LrmRequest(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp64801LrmRequest,IP_64801_LRM_REQUEST_LEN);
   	
   }
   
     /**
	 * 	Update Ip64801LrmRequest 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp64801LrmRequest(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp64801LrmRequest+targetIndex,targetLen);
    
   }
	char[] ip6480188LrmStrtReq88Value = "STRT".toCharArray();
	/**
	 *	Test condition "STRT" for isIp6480188LrmStrtReq()
	 *	@return  Returns true if isIp6480188LrmStrtReq() is "STRT"
	 */
   public boolean isIp6480188LrmStrtReq() throws CFException {
      return (  compareChars( getIp64801LrmRequest() , ip6480188LrmStrtReq88Value)  == 0  );
   }


	/**
	*  set values "STRT"
	*/
   	public void setIp6480188LrmStrtReqTrue() {  			
    	setIp64801LrmRequest( ip6480188LrmStrtReq88Value);
   	}
	char[] ip6480188LrmDoneReq88Value = "DONE".toCharArray();
	/**
	 *	Test condition "DONE" for isIp6480188LrmDoneReq()
	 *	@return  Returns true if isIp6480188LrmDoneReq() is "DONE"
	 */
   public boolean isIp6480188LrmDoneReq() throws CFException {
      return (  compareChars( getIp64801LrmRequest() , ip6480188LrmDoneReq88Value)  == 0  );
   }


	/**
	*  set values "DONE"
	*/
   	public void setIp6480188LrmDoneReqTrue() {  			
    	setIp64801LrmRequest( ip6480188LrmDoneReq88Value);
   	}
	/**
	 *	Returns the value of ip64801LrmJobgrpName
	 *	@return ip64801LrmJobgrpName
	 */
   public char[] getIp64801LrmJobgrpName() throws CFException{
     if (isIp64801LrmJobgrpNameModified()) { 
        ip64801LrmJobgrpName = refreshIp64801LrmJobgrpName();
     }
   		return ip64801LrmJobgrpName;
   }

  
	/**
	*  set variable ip64801LrmJobgrpName
	*  Corresponding COBOL Variable is IP64801-LRM-JOBGRP-NAME
	*  @param value
	**/
   public void setIp64801LrmJobgrpName(char[] value) {
      ip64801LrmJobgrpName = checkIp64801LrmJobgrpNameConstraints(value);
      serializeIp64801LrmJobgrpName(ip64801LrmJobgrpName);
   } 

     /**
	 * 	Update Ip64801LrmJobgrpName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp64801LrmJobgrpName,ip64801LrmJobgrpName.length);
   	
   }
   
   public void setIp64801LrmJobgrpName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp64801LrmJobgrpName,ip64801LrmJobgrpName.length);
   	
   }
   
     /**
	 * 	Update Ip64801LrmJobgrpName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp64801LrmJobgrpName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip64801LrmJobgrpName with another Field
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(Field source) {
       replace(source,0,source.length(),beginIp64801LrmJobgrpName,IP_64801_LRM_JOBGRP_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip64801LrmJobgrpName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp64801LrmJobgrpName,IP_64801_LRM_JOBGRP_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip64801LrmJobgrpName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp64801LrmJobgrpName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp64801LrmJobgrpName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip64801LrmJobgrpNum
	 *	@return ip64801LrmJobgrpNum
	 */
	public int getIp64801LrmJobgrpNum() throws CFException {
       if (isIp64801LrmJobgrpNumModified()) { 
           ip64801LrmJobgrpNum = refreshIp64801LrmJobgrpNum();
        }
   		return ip64801LrmJobgrpNum;
	}
	

	
	   
	/**
	 * 	Update Ip64801LrmJobgrpNum with the passed value
	 *  Corresponding COBOL Variable is IP64801-LRM-JOBGRP-NUM
	 *	@param number
	 */
	public void setIp64801LrmJobgrpNum(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip64801LrmJobgrpNum = checkIp64801LrmJobgrpNumMaxLimit(number); 
		serializeIp64801LrmJobgrpNum(ip64801LrmJobgrpNum);
	}
	

	public void setIp64801LrmJobgrpNum(long number) {
	    number = checkIp64801LrmJobgrpNumMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp64801LrmJobgrpNum((int)number);
	}
	
	/**
	 * 	Update Ip64801LrmJobgrpNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp64801LrmJobgrpNum(char[] value) throws CFException {
		 ip64801LrmJobgrpNum = serializeIp64801LrmJobgrpNum(value);
	}
	/**
	 * 	Update Ip64801LrmJobgrpNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp64801LrmJobgrpNumString(char[] value) throws CFException {
		 setIp64801LrmJobgrpNum(value);
	}
	/**
	 *	Returns the value of ip64801LrmSelSqlCnt
	 *	@return ip64801LrmSelSqlCnt
	 */
	public int getIp64801LrmSelSqlCnt() throws CFException {
       if (isIp64801LrmSelSqlCntModified()) { 
           ip64801LrmSelSqlCnt = refreshIp64801LrmSelSqlCnt();
        }
   		return ip64801LrmSelSqlCnt;
	}
	

	
	   
	/**
	 * 	Update Ip64801LrmSelSqlCnt with the passed value
	 *  Corresponding COBOL Variable is IP64801-LRM-SEL-SQL-CNT
	 *	@param number
	 */
	public void setIp64801LrmSelSqlCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip64801LrmSelSqlCnt = checkIp64801LrmSelSqlCntMaxLimit(number); 
		serializeIp64801LrmSelSqlCnt(ip64801LrmSelSqlCnt);
	}
	

	public void setIp64801LrmSelSqlCnt(long number) {
	    number = checkIp64801LrmSelSqlCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp64801LrmSelSqlCnt((int)number);
	}
	
	/**
	 * 	Update Ip64801LrmSelSqlCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp64801LrmSelSqlCnt(char[] value) throws CFException {
		 ip64801LrmSelSqlCnt = serializeIp64801LrmSelSqlCnt(value);
	}
	/**
	 * 	Update Ip64801LrmSelSqlCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp64801LrmSelSqlCntString(char[] value) throws CFException {
		 setIp64801LrmSelSqlCnt(value);
	}
	/**
	 *	Returns the  value of ip64801LrmSelSqlDtl
	 *  Corresponding COBOL Variable is IP64801-LRM-SEL-SQL-DTL
	 *	@return ip64801LrmSelSqlDtl
	 */
   public List<Ip64801LrmSelSqlDtl> getIp64801LrmSelSqlDtl() {
       return ip64801LrmSelSqlDtl;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip64801LrmSelSqlDtl
	 */
	public Ip64801LrmSelSqlDtl getIp64801LrmSelSqlDtl(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp64801LrmSelSqlDtl(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_64801_LRM_SEL_SQL_DTL_SIZE) {
             	index = IP_64801_LRM_SEL_SQL_DTL_SIZE -1; // can't exceed max array size
             	logger.trace("ip64801LrmSelSqlDtl - Array index exceeded max Size {}, resetting it to max allowed",IP_64801_LRM_SEL_SQL_DTL_SIZE); 
	    }
		if (index >= ip64801LrmSelSqlDtl.size()) {
       		for (int fillIndex =  ip64801LrmSelSqlDtl.size() -1; fillIndex < index;fillIndex++) {
		       ip64801LrmSelSqlDtl.add(null);
		    }
			ip64801LrmSelSqlDtl.set(index,
			   	   	new Ip64801LrmSelSqlDtl(this,beginIp64801LrmSelSqlDtl + index * Ip64801LrmSelSqlDtl.getIp64801LrmSelSqlDtlFieldLength()) 
				                        ); 	
		} 
   	   Ip64801LrmSelSqlDtl value = ip64801LrmSelSqlDtl.get(index);
   	   if (value == null) {
   	      ip64801LrmSelSqlDtl.set(index,
			   	   	new Ip64801LrmSelSqlDtl(this,beginIp64801LrmSelSqlDtl + index * Ip64801LrmSelSqlDtl.getIp64801LrmSelSqlDtlFieldLength()) 
				                        ); 
		  value = ip64801LrmSelSqlDtl.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip64801LrmSelSqlDtl at index with the passed value
	 *  Corresponding COBOL Variable is IP64801-LRM-SEL-SQL-DTL
	 *  @param index
	 *	@param value
	 */
  public void setIp64801LrmSelSqlDtl(int index,char[] value) {
   	getIp64801LrmSelSqlDtl(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of ip64801LrmUpdComSql
	 *	@return ip64801LrmUpdComSql
	 */
	public int getIp64801LrmUpdComSql() throws CFException {
       if (isIp64801LrmUpdComSqlModified()) { 
           ip64801LrmUpdComSql = refreshIp64801LrmUpdComSql();
        }
   		return ip64801LrmUpdComSql;
	}
	

	
	   
	/**
	 * 	Update Ip64801LrmUpdComSql with the passed value
	 *  Corresponding COBOL Variable is IP64801-LRM-UPD-COM-SQL
	 *	@param number
	 */
	public void setIp64801LrmUpdComSql(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip64801LrmUpdComSql = checkIp64801LrmUpdComSqlMaxLimit(number); 
		serializeIp64801LrmUpdComSql(ip64801LrmUpdComSql);
	}
	

	public void setIp64801LrmUpdComSql(long number) {
	    number = checkIp64801LrmUpdComSqlMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp64801LrmUpdComSql((int)number);
	}
	
	/**
	 * 	Update Ip64801LrmUpdComSql with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp64801LrmUpdComSql(char[] value) throws CFException {
		 ip64801LrmUpdComSql = serializeIp64801LrmUpdComSql(value);
	}
	/**
	 * 	Update Ip64801LrmUpdComSql with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp64801LrmUpdComSqlString(char[] value) throws CFException {
		 setIp64801LrmUpdComSql(value);
	}
	/**
	 *	Returns the value of ip64801LrmUpdComMod
	 *	@return ip64801LrmUpdComMod
	 */
   public char[] getIp64801LrmUpdComMod() throws CFException{
     if (isIp64801LrmUpdComModModified()) { 
        ip64801LrmUpdComMod = refreshIp64801LrmUpdComMod();
     }
   		return ip64801LrmUpdComMod;
   }

  
	/**
	*  set variable ip64801LrmUpdComMod
	*  Corresponding COBOL Variable is IP64801-LRM-UPD-COM-MOD
	*  @param value
	**/
   public void setIp64801LrmUpdComMod(char[] value) {
      ip64801LrmUpdComMod = checkIp64801LrmUpdComModConstraints(value);
      serializeIp64801LrmUpdComMod(ip64801LrmUpdComMod);
   } 

     /**
	 * 	Update Ip64801LrmUpdComMod 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp64801LrmUpdComMod(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp64801LrmUpdComMod,ip64801LrmUpdComMod.length);
   	
   }
   
   public void setIp64801LrmUpdComMod(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp64801LrmUpdComMod,ip64801LrmUpdComMod.length);
   	
   }
   
     /**
	 * 	Update Ip64801LrmUpdComMod 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp64801LrmUpdComMod(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp64801LrmUpdComMod+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip64801LrmUpdComMod with another Field
	 *	@param value
	 */
   public void setIp64801LrmUpdComMod(Field source) {
       replace(source,0,source.length(),beginIp64801LrmUpdComMod,IP_64801_LRM_UPD_COM_MOD_LEN);
   	
   }  
   
     /**
	 * 	Update Ip64801LrmUpdComMod 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp64801LrmUpdComMod(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp64801LrmUpdComMod,IP_64801_LRM_UPD_COM_MOD_LEN);
   	
   }
   
     /**
	 * 	Update Ip64801LrmUpdComMod 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp64801LrmUpdComMod(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp64801LrmUpdComMod+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of ip64801LrmReqStat
	 *	@return ip64801LrmReqStat
	 */
   public char[] getIp64801LrmReqStat() throws CFException{
     if (isIp64801LrmReqStatModified()) { 
        ip64801LrmReqStat = refreshIp64801LrmReqStat();
     }
   		return ip64801LrmReqStat;
   }

  
	/**
	*  set variable ip64801LrmReqStat
	*  Corresponding COBOL Variable is IP64801-LRM-REQ-STAT
	*  @param value
	**/
   public void setIp64801LrmReqStat(char[] value) {
      ip64801LrmReqStat = checkIp64801LrmReqStatConstraints(value);
      serializeIp64801LrmReqStat(ip64801LrmReqStat);
   } 

     /**
	 * 	Update Ip64801LrmReqStat 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp64801LrmReqStat(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp64801LrmReqStat,ip64801LrmReqStat.length);
   	
   }
   
   public void setIp64801LrmReqStat(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp64801LrmReqStat,ip64801LrmReqStat.length);
   	
   }
   
     /**
	 * 	Update Ip64801LrmReqStat 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp64801LrmReqStat(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp64801LrmReqStat+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip64801LrmReqStat with another Field
	 *	@param value
	 */
   public void setIp64801LrmReqStat(Field source) {
       replace(source,0,source.length(),beginIp64801LrmReqStat,IP_64801_LRM_REQ_STAT_LEN);
   	
   }  
   
     /**
	 * 	Update Ip64801LrmReqStat 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp64801LrmReqStat(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp64801LrmReqStat,IP_64801_LRM_REQ_STAT_LEN);
   	
   }
   
     /**
	 * 	Update Ip64801LrmReqStat 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp64801LrmReqStat(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp64801LrmReqStat+targetIndex,targetLen);
    
   }
	char[] ip6480188LrmStatAok88Value = "AOK".toCharArray();
	/**
	 *	Test condition "AOK" for isIp6480188LrmStatAok()
	 *	@return  Returns true if isIp6480188LrmStatAok() is "AOK"
	 */
   public boolean isIp6480188LrmStatAok() throws CFException {
      return (  compareChars( getIp64801LrmReqStat() , ip6480188LrmStatAok88Value)  == 0  );
   }


	/**
	*  set values "AOK"
	*/
   	public void setIp6480188LrmStatAokTrue() {  			
    	setIp64801LrmReqStat( ip6480188LrmStatAok88Value);
   	}
	char[] ip6480188LrmStatBad88Value = "BAD".toCharArray();
	/**
	 *	Test condition "BAD" for isIp6480188LrmStatBad()
	 *	@return  Returns true if isIp6480188LrmStatBad() is "BAD"
	 */
   public boolean isIp6480188LrmStatBad() throws CFException {
      return (  compareChars( getIp64801LrmReqStat() , ip6480188LrmStatBad88Value)  == 0  );
   }


	/**
	*  set values "BAD"
	*/
   	public void setIp6480188LrmStatBadTrue() {  			
    	setIp64801LrmReqStat( ip6480188LrmStatBad88Value);
   	}
	char[] ip6480188LrmStatEnd88Value = "END".toCharArray();
	/**
	 *	Test condition "END" for isIp6480188LrmStatEnd()
	 *	@return  Returns true if isIp6480188LrmStatEnd() is "END"
	 */
   public boolean isIp6480188LrmStatEnd() throws CFException {
      return (  compareChars( getIp64801LrmReqStat() , ip6480188LrmStatEnd88Value)  == 0  );
   }


	/**
	*  set values "END"
	*/
   	public void setIp6480188LrmStatEndTrue() {  			
    	setIp64801LrmReqStat( ip6480188LrmStatEnd88Value);
   	}
	/**
	 *	Returns the value of ip64801LrmBadRsn
	 *	@return ip64801LrmBadRsn
	 */
	public int getIp64801LrmBadRsn() throws CFException {
       if (isIp64801LrmBadRsnModified()) { 
           ip64801LrmBadRsn = refreshIp64801LrmBadRsn();
        }
   		return ip64801LrmBadRsn;
	}
	

	
	   
	/**
	 * 	Update Ip64801LrmBadRsn with the passed value
	 *  Corresponding COBOL Variable is IP64801-LRM-BAD-RSN
	 *	@param number
	 */
	public void setIp64801LrmBadRsn(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip64801LrmBadRsn = checkIp64801LrmBadRsnMaxLimit(number); 
		serializeIp64801LrmBadRsn(ip64801LrmBadRsn);
	}
	

	public void setIp64801LrmBadRsn(long number) {
	    number = checkIp64801LrmBadRsnMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp64801LrmBadRsn((int)number);
	}
	
	/**
	 * 	Update Ip64801LrmBadRsn with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp64801LrmBadRsn(char[] value) throws CFException {
		 ip64801LrmBadRsn = serializeIp64801LrmBadRsn(value);
	}
	/**
	 * 	Update Ip64801LrmBadRsn with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp64801LrmBadRsnString(char[] value) throws CFException {
		 setIp64801LrmBadRsn(value);
	}
	
	/**
	 *	Test condition 1 for isIp6480188LrmReqCdBad()
	 *	@return  Returns true if isIp6480188LrmReqCdBad() is 1
	 */
   public boolean isIp6480188LrmReqCdBad() throws CFException {
      return (  getIp64801LrmBadRsn()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setIp6480188LrmReqCdBadTrue() {  			
    	setIp64801LrmBadRsn( 1);
   	}
	
	/**
	 *	Test condition 2 for isIp6480188LrmJobGrpBad()
	 *	@return  Returns true if isIp6480188LrmJobGrpBad() is 2
	 */
   public boolean isIp6480188LrmJobGrpBad() throws CFException {
      return (  getIp64801LrmBadRsn()  ==  2  );
   }


	/**
	*  set values 2
	*/
   	public void setIp6480188LrmJobGrpBadTrue() {  			
    	setIp64801LrmBadRsn( 2);
   	}
	
	/**
	 *	Test condition 3 for isIp6480188LrmJobNbrBad()
	 *	@return  Returns true if isIp6480188LrmJobNbrBad() is 3
	 */
   public boolean isIp6480188LrmJobNbrBad() throws CFException {
      return (  getIp64801LrmBadRsn()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setIp6480188LrmJobNbrBadTrue() {  			
    	setIp64801LrmBadRsn( 3);
   	}
	
	/**
	 *	Test condition 4 for isIp6480188LrmSqlCntBad()
	 *	@return  Returns true if isIp6480188LrmSqlCntBad() is 4
	 */
   public boolean isIp6480188LrmSqlCntBad() throws CFException {
      return (  getIp64801LrmBadRsn()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setIp6480188LrmSqlCntBadTrue() {  			
    	setIp64801LrmBadRsn( 4);
   	}
	
	/**
	 *	Test condition 5 for isIp6480188LrmSqlNbrBad()
	 *	@return  Returns true if isIp6480188LrmSqlNbrBad() is 5
	 */
   public boolean isIp6480188LrmSqlNbrBad() throws CFException {
      return (  getIp64801LrmBadRsn()  ==  5  );
   }


	/**
	*  set values 5
	*/
   	public void setIp6480188LrmSqlNbrBadTrue() {  			
    	setIp64801LrmBadRsn( 5);
   	}
	
	/**
	 *	Test condition 6 for isIp6480188LrmSqlRtnBad()
	 *	@return  Returns true if isIp6480188LrmSqlRtnBad() is 6
	 */
   public boolean isIp6480188LrmSqlRtnBad() throws CFException {
      return (  getIp64801LrmBadRsn()  ==  6  );
   }


	/**
	*  set values 6
	*/
   	public void setIp6480188LrmSqlRtnBadTrue() {  			
    	setIp64801LrmBadRsn( 6);
   	}
	/**
	 *	Returns the value of ip64801LrmJobgrpId
	 *	@return ip64801LrmJobgrpId
	 */
   public char[] getIp64801LrmJobgrpId() throws CFException{
     if (isIp64801LrmJobgrpIdModified()) { 
        ip64801LrmJobgrpId = refreshIp64801LrmJobgrpId();
     }
   		return ip64801LrmJobgrpId;
   }

  
	/**
	*  set variable ip64801LrmJobgrpId
	*  Corresponding COBOL Variable is IP64801-LRM-JOBGRP-ID
	*  @param value
	**/
   public void setIp64801LrmJobgrpId(char[] value) {
      ip64801LrmJobgrpId = checkIp64801LrmJobgrpIdConstraints(value);
      serializeIp64801LrmJobgrpId(ip64801LrmJobgrpId);
   } 

     /**
	 * 	Update Ip64801LrmJobgrpId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp64801LrmJobgrpId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp64801LrmJobgrpId,ip64801LrmJobgrpId.length);
   	
   }
   
   public void setIp64801LrmJobgrpId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp64801LrmJobgrpId,ip64801LrmJobgrpId.length);
   	
   }
   
     /**
	 * 	Update Ip64801LrmJobgrpId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp64801LrmJobgrpId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp64801LrmJobgrpId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip64801LrmJobgrpId with another Field
	 *	@param value
	 */
   public void setIp64801LrmJobgrpId(Field source) {
       replace(source,0,source.length(),beginIp64801LrmJobgrpId,IP_64801_LRM_JOBGRP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Ip64801LrmJobgrpId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp64801LrmJobgrpId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp64801LrmJobgrpId,IP_64801_LRM_JOBGRP_ID_LEN);
   	
   }
   
     /**
	 * 	Update Ip64801LrmJobgrpId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp64801LrmJobgrpId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp64801LrmJobgrpId+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip64801LrmCommBlock
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp64801LrmRequest(CONSTANTS.SPACE_4);
         setIp64801LrmJobgrpName(CONSTANTS.SPACE_6);
                     setIp64801LrmJobgrpNum(0);
                     setIp64801LrmSelSqlCnt(0);
     if (ip64801LrmSelSqlDtl.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_64801_LRM_SEL_SQL_DTL_SIZE;index++) {
              Ip64801LrmSelSqlDtl  newElement = new Ip64801LrmSelSqlDtl(this,beginIp64801LrmSelSqlDtl + index * Ip64801LrmSelSqlDtl.getIp64801LrmSelSqlDtlFieldLength());
              newElement.initialize();
               ip64801LrmSelSqlDtl.add(newElement);
          }
     } else {
        if (ip64801LrmSelSqlDtl.size() < IP_64801_LRM_SEL_SQL_DTL_SIZE) {
          // prefill it first
          for (int index = ip64801LrmSelSqlDtl.size();index <  IP_64801_LRM_SEL_SQL_DTL_SIZE;index++) {
              Ip64801LrmSelSqlDtl  newElement = new Ip64801LrmSelSqlDtl(this,beginIp64801LrmSelSqlDtl + index * Ip64801LrmSelSqlDtl.getIp64801LrmSelSqlDtlFieldLength());
               ip64801LrmSelSqlDtl.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_64801_LRM_SEL_SQL_DTL_SIZE;index++) {
     		Ip64801LrmSelSqlDtl ip64801LrmSelSqlDtlVar = ip64801LrmSelSqlDtl.get(index);
 			if (ip64801LrmSelSqlDtlVar == null) {
                ip64801LrmSelSqlDtlVar = new Ip64801LrmSelSqlDtl(this,beginIp64801LrmSelSqlDtl + index * Ip64801LrmSelSqlDtl.getIp64801LrmSelSqlDtlFieldLength());
                  ip64801LrmSelSqlDtl.set(index, ip64801LrmSelSqlDtlVar);
			} 
			ip64801LrmSelSqlDtlVar.initialize();
		}
     }
                     setIp64801LrmUpdComSql(0);
         setIp64801LrmUpdComMod(CONSTANTS.SPACE_8);
         setIp64801LrmReqStat(CONSTANTS.SPACE_3);
                     setIp64801LrmBadRsn(0);
         setIp64801LrmJobgrpId(CONSTANTS.SPACE_8);
   }

		public static int getIp64801LrmCommBlockFieldLength() {
			return IP_64801_LRM_COMM_BLOCK_LENGTH;
		}

}
  

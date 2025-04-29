package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip64801LrmCommBlock is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;

            @Component("global_ip64801LrmCommBlock")

@Data
public class Ip64801LrmCommBlock extends Ip64801LrmCommBlockSerialized  implements InitializingBean {
   

						@Getter @Setter private char[] ip64801LrmRequest = Field.fillLowValue(4);

						@Getter @Setter private char[] ip64801LrmJobgrpName = Field.fillLowValue(6);

								@Getter @Setter private int ip64801LrmJobgrpNum;

								@Getter @Setter private int ip64801LrmSelSqlCnt;
			@Getter @Setter private List<Ip64801LrmSelSqlDtl> ip64801LrmSelSqlDtl = new ArrayList<>();
    	

								@Getter @Setter private int ip64801LrmUpdComSql;

						@Getter @Setter private char[] ip64801LrmUpdComMod = Field.fillLowValue(8);

						@Getter @Setter private char[] ip64801LrmReqStat = Field.fillLowValue(3);

								@Getter @Setter private int ip64801LrmBadRsn;

						@Getter @Setter private char[] ip64801LrmJobgrpId = Field.fillLowValue(8);
	
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
						getIp64801LrmSelSqlDtl().add(new Ip64801LrmSelSqlDtl(this, beginIp64801LrmSelSqlDtl + 
						arrayIndex * Ip64801LrmSelSqlDtl.getIp64801LrmSelSqlDtlFieldLength()));
				}
	   	/*  end of offset */
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
              getIp64801LrmSelSqlDtl().add(newElement);
          }
     } else {
        if (ip64801LrmSelSqlDtl.size() < IP_64801_LRM_SEL_SQL_DTL_SIZE) {
          // prefill it first
          for (int index = ip64801LrmSelSqlDtl.size();index <  IP_64801_LRM_SEL_SQL_DTL_SIZE;index++) {
              Ip64801LrmSelSqlDtl  newElement = new Ip64801LrmSelSqlDtl(this,beginIp64801LrmSelSqlDtl + index * Ip64801LrmSelSqlDtl.getIp64801LrmSelSqlDtlFieldLength());
              getIp64801LrmSelSqlDtl().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_64801_LRM_SEL_SQL_DTL_SIZE;index++) {
     		Ip64801LrmSelSqlDtl ip64801LrmSelSqlDtlVar = ip64801LrmSelSqlDtl.get(index);
 			if (ip64801LrmSelSqlDtlVar == null) {
                ip64801LrmSelSqlDtlVar = new Ip64801LrmSelSqlDtl(this,beginIp64801LrmSelSqlDtl + index * Ip64801LrmSelSqlDtl.getIp64801LrmSelSqlDtlFieldLength());
                  getIp64801LrmSelSqlDtl().set(index, ip64801LrmSelSqlDtlVar);
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


}
  

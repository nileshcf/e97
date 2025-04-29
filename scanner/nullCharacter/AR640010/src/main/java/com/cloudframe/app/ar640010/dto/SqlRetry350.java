package com.cloudframe.app.ar640010.dto;

/**
*  The class SqlRetry350 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class SqlRetry350 extends SqlRetry350Serialized {
   

								@Getter @Setter private short sqlRetryAttempts350;
				@Getter @Setter private SqlRetryIntervalGroup350 sqlRetryIntervalGroup350 = new SqlRetryIntervalGroup350();

								@Getter @Setter private short sqlRetryAttemptsD350;

								@Getter @Setter private long sqlRetryIntervalD350;
	
	/**
	* Constructor for SqlRetry350
	**/
    public SqlRetry350() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSqlRetryIntervalGroup350().setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
								setSqlRetryAttempts350((short)30);
								setSqlRetryAttemptsD350((short)30);
								setSqlRetryIntervalD350(100L);
    }





}
  

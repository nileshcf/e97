package com.cloudframe.app.ar640010.dto;

/**
*  The class SqlWorkAreas840 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class SqlWorkAreas840 extends SqlWorkAreas840Serialized {
   

						@Getter @Setter private char[] currentTs840 = new char[26];
				@Getter @Setter private CurrentTs840Redefined currentTs840Redefined = new CurrentTs840Redefined();

								@Getter @Setter private int filesAvail840;

						@Getter @Setter private char[] oldStatCd840 = new char[1];

						@Getter @Setter private char[] oldLstUpdtTs840 = new char[26];
	
	/**
	* Constructor for SqlWorkAreas840
	**/
    public SqlWorkAreas840() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getCurrentTs840Redefined().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setCurrentTs840(fillSpace(26));
								setFilesAvail840(0);
								setOldStatCd840(fillSpace(1));
								setOldLstUpdtTs840(fillSpace(26));
    }





}
  

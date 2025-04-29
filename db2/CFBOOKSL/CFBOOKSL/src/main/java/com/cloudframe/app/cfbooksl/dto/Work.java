package com.cloudframe.app.cfbooksl.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] space = new char[1];

						@Getter @Setter private char[] headerLabel = new char[132];

						@Getter @Setter private char[] headerLine = new char[132];

						@Getter @Setter private char[] pageBreak = new char[132];

						@Getter @Setter private char[] footer = new char[132];

						@Getter @Setter private char[] errPgm = new char[6];

						@Getter @Setter private char[] errLoc = new char[20];

						@Getter @Setter private char[] errMsg = new char[30];

								@Getter @Setter private long errCode;

								@Getter @Setter private int repopStat;

						@Getter @Setter private char[] eofFlag = new char[1];

								@Getter @Setter private int writeRec;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setSpace(fillSpace(1));
								setHeaderLabel("book id  title                                                                          page  rate  isbn no.       p.date      p.id ".toCharArray());
								setHeaderLine("-------- -----------------------------------------------------------------------------  ----  ----  -------------  ----------  ---- ".toCharArray());
								setPageBreak("----------------------------------------------------------------------------------------------------------------------------------- ".toCharArray());
								setFooter("========================================================== end of report ===========================================================".toCharArray());
								setErrPgm(("db2rep").toCharArray());
								setErrLoc(fillSpace(20));
								setErrMsg(fillSpace(30));
								setErrCode(0L);
								setRepopStat(0);
								setEofFlag(("n").toCharArray());
								setWriteRec(0);
    }





}
  

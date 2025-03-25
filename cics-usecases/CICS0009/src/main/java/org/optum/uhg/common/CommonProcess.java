package org.optum.uhg.common;
import org.optum.uhg.exception.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.process.BaseProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.cloudframe.app.dao.Db2Base;
import org.optum.uhg.service.*;
import com.cloudframe.app.process.BaseProcess;
public class CommonProcess extends BaseProcess {
	@Override
	protected void handleExceptionForRest(Exception e) throws Exception {
		if (e instanceof CFException) {
			CFException cfe = (CFException) e;
			if (cfe.isDb2Related() && !cfe.isTerminated()) {
				DatabaseException dbe = DatabaseException.getException(cfe.getMessage(), e);
				dbe.setRc(cfe.getCode());
				throw dbe;
			}

			if (!cfe.isDb2Related() && !cfe.isTerminated()) {
				BusinessException be = BusinessException.getException(cfe.getMessage(), e);
				be.setRc(cfe.getCode());
				throw be;
			}
		} else {
			org.optum.uhg.exception.RuntimeException rt = org.optum.uhg.exception.RuntimeException.getException(e.getMessage(), e);
			rt.setRc(12);
			throw rt;
		}
	}
}

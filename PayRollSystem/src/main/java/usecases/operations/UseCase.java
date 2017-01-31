package usecases.operations;

import usecases.operations.datastructures.Request;

public interface UseCase<T extends Request> {
	public abstract void execute(T addEmployeeRequest);
}

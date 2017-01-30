package usecases.operations;

import usecases.operations.datastructures.AddEmployeeRequest;

public interface UseCase<T extends AddEmployeeRequest> {
	public abstract void execute(T addEmployeeRequest);
}


package acme.features.worker.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.applications.Application;
import acme.entities.roles.Worker;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.services.AbstractShowService;

@Service
public class WorkerApplicationShowService implements AbstractShowService<Worker, Application> {
	// Internal state -----------------------------------------------------------------------

	@Autowired
	WorkerApplicationRepository repository;


	// AbstractListService<Worker,Application> interface -----------------------

	@Override
	public boolean authorise(final Request<Application> request) {
		assert request != null;
		return true;

		//		boolean result;
		//		int applicationId;
		//		Application application;
		//		Worker worker;
		//		Principal principal;
		//
		//		applicationId = request.getModel().getInteger("id");
		//		application = this.repository.findOneApplicationById(applicationId);
		//		worker = application.getWorker();
		//		principal = request.getPrincipal();
		//		result =
	}

	@Override
	public void unbind(final Request<Application> request, final Application entity, final Model model) {
		// TODO Auto-generated method stub

	}

	@Override
	public Application findOne(final Request<Application> request) {
		// TODO Auto-generated method stub
		return null;
	}
}

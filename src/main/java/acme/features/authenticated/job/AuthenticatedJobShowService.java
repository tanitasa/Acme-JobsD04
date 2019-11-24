
package acme.features.authenticated.job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.jobs.Job;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractShowService;

@Service
public class AuthenticatedJobShowService implements AbstractShowService<Authenticated, Job> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AuthenticatedJobRepository repository;


	// AbstractShowService<Authenticated, Challenge> interface ---------------

	@Override
	public boolean authorise(final Request<Job> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<Job> request, final Job entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "reference", "title", "status", "deadLine", "salary", "link", "isActive", "descriptor", "employer", "applications");

	}

	@Override
	public Job findOne(final Request<Job> job) {
		assert job != null;

		Job result;
		int id;

		id = job.getModel().getInteger("id");
		result = this.repository.findOneById(id);

		return result;
	}

}

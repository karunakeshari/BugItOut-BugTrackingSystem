/**
 * 
 */
package com.bts.service;

import java.util.Set;

import com.bts.beans.Bug;
import com.bts.beans.Project;
import com.bts.beans.Team;
import com.bts.exceptions.DataAccessException;
import com.bts.exceptions.InvalidDataException;
import com.bts.exceptions.ProjectManagerLimitExceededException;
import com.bts.exceptions.ProjectNotFoundException;
import com.bts.exceptions.TeamNotFoundException;

/**
 * 
 */
public interface ProjectService {
	void createProject(Project project) throws DataAccessException, InvalidDataException, ProjectManagerLimitExceededException;
    Project getProjectByID(int projectID) throws ProjectNotFoundException, DataAccessException;
    Set<Project> getAllProjects() throws DataAccessException;
    Set<Project> getProjectsManagedByUser(int projectManagerID) throws DataAccessException;
    Team getProjectTeam(int projectID) throws TeamNotFoundException, DataAccessException;
    Set<Bug> getProjectBugs(int projectID) throws DataAccessException;

}

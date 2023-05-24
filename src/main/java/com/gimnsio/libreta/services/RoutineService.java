package com.gimnsio.libreta.services;

import com.gimnsio.libreta.domain.Routine;
import com.gimnsio.libreta.domain.User;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface RoutineService {

    public List<Routine> getAllRoutines(Pageable pageable);
    public Routine getRoutineById(long id);
    public List<Routine> getRoutinesByUser(User user);
    public Routine createRoutine(Routine routine);
    public Routine updateRoutine(long id, Routine routine);
    public void deleteRoutine(long id);
}

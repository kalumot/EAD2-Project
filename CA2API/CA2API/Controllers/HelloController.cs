using Microsoft.AspNetCore.Mvc;
using System;
using HelloWorldWebAPI.Models;
using System.Collections.Generic;

namespace HelloWorldWebAPI.Controllers
{
    [Route("api/")]
    [ApiController]
    public class HelloController : ControllerBase
    {

        // GET /api/id    Retrieves matches containing team of ID
        [HttpGet("{id}")]
        public ActionResult<List<Match>> Get(int id)
        {
            return Ok(Program.QueryTeam(id));      // 200 OK
        }

        // GET /api/team/all    Retrieves all Teams
        [HttpGet("team/all")]
        public ActionResult<List<Team>> AllTeams(String name)
        {
            return Ok(Program.QueryAllTeams());      // 200 OK

        }
    }
}

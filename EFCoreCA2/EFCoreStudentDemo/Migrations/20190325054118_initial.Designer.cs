﻿// <auto-generated />
using System;
using EFCoreCA2;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Infrastructure;
using Microsoft.EntityFrameworkCore.Metadata;
using Microsoft.EntityFrameworkCore.Migrations;
using Microsoft.EntityFrameworkCore.Storage.ValueConversion;

namespace EFCoreCA2.Migrations
{
    [DbContext(typeof(FootballContext))]
    [Migration("20190325054118_initial")]
    partial class initial
    {
        protected override void BuildTargetModel(ModelBuilder modelBuilder)
        {
#pragma warning disable 612, 618
            modelBuilder
                .HasAnnotation("ProductVersion", "2.2.0-rtm-35687")
                .HasAnnotation("Relational:MaxIdentifierLength", 128)
                .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

            modelBuilder.Entity("EFCoreCA2.Match", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<int?>("AwayID");

                    b.Property<int?>("HomeID");

                    b.HasKey("ID");

                    b.HasIndex("AwayID");

                    b.HasIndex("HomeID");

                    b.ToTable("Matches");
                });

            modelBuilder.Entity("EFCoreCA2.Team", b =>
                {
                    b.Property<int>("ID")
                        .ValueGeneratedOnAdd()
                        .HasAnnotation("SqlServer:ValueGenerationStrategy", SqlServerValueGenerationStrategy.IdentityColumn);

                    b.Property<string>("Name");

                    b.HasKey("ID");

                    b.ToTable("Teams");
                });

            modelBuilder.Entity("EFCoreCA2.Match", b =>
                {
                    b.HasOne("EFCoreCA2.Team", "Away")
                        .WithMany()
                        .HasForeignKey("AwayID");

                    b.HasOne("EFCoreCA2.Team", "Home")
                        .WithMany()
                        .HasForeignKey("HomeID");
                });
#pragma warning restore 612, 618
        }
    }
}
